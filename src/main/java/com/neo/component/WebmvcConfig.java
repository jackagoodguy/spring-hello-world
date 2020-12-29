package com.neo.component;

import com.neo.interceptor.InterceptorDemo;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration //WebMvcConfigurerAdapter
public class WebmvcConfig extends WebMvcConfigurationSupport {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		super.addInterceptors(registry);
		registry.addInterceptor(new InterceptorDemo()).addPathPatterns("/**");
	}
	
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowedOrigins("http://localhost:9992");
		//registry.addMapping("/api/**").allowedOrigins("http://localhost:8888");
	}

}
