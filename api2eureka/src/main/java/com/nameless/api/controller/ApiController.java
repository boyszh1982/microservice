package com.nameless.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nameless.api.service.IApiService;

@RestController
@RequestMapping("/api")
public class ApiController {

	@Autowired
	IApiService apiService ;
	
	@RequestMapping(value="show/{msg}")
	public Object show(@PathVariable(value="msg") String msg ){
		// msg is null ? why ?
		// https://spring.io/blog/2015/01/20/microservice-registration-and-discovery-with-spring-cloud-and-netflix-s-eureka
		// 惨遭以上开发 balance call 客户端
		System.out.println(msg);
		
		return apiService.show(msg );
	}
}
