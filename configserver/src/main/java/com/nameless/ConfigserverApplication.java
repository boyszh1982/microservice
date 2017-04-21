package com.nameless;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigserverApplication {

	/**
	 * configserver在GITHUB上脚本变更后会自动刷新,
	 * 此时需要对configcleint执行 curl -d {} http://localhost:8080/refresh刷新配置
	 * 需要用户名密码的注册中心，如何做？
	 * configserver高可用如何实现？
	 * 断路器
	 * 服务发现
	 * 消息队列-红包在内存中生成
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(ConfigserverApplication.class, args);
	}
}
