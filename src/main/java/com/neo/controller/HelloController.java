package com.neo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class HelloController {

    @Value("${server.servlet.context-path}")
    private String info;

    @RequestMapping(value = "/postJson" , method = RequestMethod.POST)
    public String writeAppLog(@RequestBody String content) throws Exception {
        return content;
    }
    

    @RequestMapping("/")
    public String index() {
       // return "Hello Spring Boot 2.0!";
        return "this  is "+ info;
    }


    @PostMapping("/postInfo")
    public String getFile(@RequestParam(value = "key") String key , @RequestParam(value = "value") String value ) {

        return key + " : " + value;
    }
}