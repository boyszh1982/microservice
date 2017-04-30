package com.nameless.api.controller;

import javax.ws.rs.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nameless.api.service.IApiService;

@RestController
@RequestMapping("/api")
public class ApiController {

	@Autowired
	IApiService apiService ;
	
	@RequestMapping(value="show/{abcdefg}")
	public Object show(@PathParam("abcdefg") String msg , @RequestParam("f") String f){
		// msg is null ? why ?
		// https://spring.io/blog/2015/01/20/microservice-registration-and-discovery-with-spring-cloud-and-netflix-s-eureka
		// 惨遭以上开发 balance call 客户端
		System.out.println(msg);
		System.out.println(f);
		return apiService.show(msg + f);
	}
}
