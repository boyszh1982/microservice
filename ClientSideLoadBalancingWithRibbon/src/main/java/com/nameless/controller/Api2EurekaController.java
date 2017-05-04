package com.nameless.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nameless.service.Api2Eureka;

/**
 * http://localhost:9000/client/show/message -> http://localhost:8010/api/show/message
 *                                              http://localhost:8011/api/show/message
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/client")
public class Api2EurekaController {

	@Autowired
	Api2Eureka api2Eureka;
	
	@RequestMapping("show/{msg}")
	public Object show(@PathVariable("msg") String msg) {
		return api2Eureka.show(msg);
	}
}
