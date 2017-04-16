package com.nameless.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController("/")
public class ConfigRefreshController {
	
	/**
	 * ${message} 在多个配置文件中不能重复
	 */
	@Value("${message}")
	private String message ;
	
	@RequestMapping("say")
	public String say(){
		return String.format("Hello World ! . %s", message);
	}
	
}
