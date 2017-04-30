package com.nameless.api.service.impl;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.nameless.api.service.IApiService;

@Service
public class ApiServiceImpl implements IApiService {
	
	@Value("${api2eureka.version}")
	private String version;
	
	@Override
	public Object show(String msg) {
		Map<String,String> map = new LinkedHashMap<String,String>();
		map.put("show.msg", msg);
		map.put("api2eureka.version", this.version);
		map.put("thread.name",Thread.currentThread().getName());
		return map;
	}

}
