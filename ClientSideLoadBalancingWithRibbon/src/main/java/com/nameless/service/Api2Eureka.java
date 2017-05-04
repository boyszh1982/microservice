package com.nameless.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * API2EUREKA or api2eureka 
 * @author Administrator
 *
 */
@FeignClient("API2EUREKA")
public interface Api2Eureka {
	@RequestMapping(value="/api/show/{msg}",method=RequestMethod.GET)
	Object show(@PathVariable("msg") String msg);
}
