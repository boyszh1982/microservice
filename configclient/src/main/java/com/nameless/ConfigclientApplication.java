package com.nameless;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConfigclientApplication {

	/**
	 * rabbitmqctl.bat environment --查看端口等
	 * rabbitmqctl.bat list_users --查看用户
	 * 
	 * bus 不起作用，没有通知其他节点conf的变更，连自己的脚本都刷新不到了。
	 * 
	 * http://localhost:7001/configclient/uat
	 * http://localhost:8080/say $curl -d {} localhost:8080/refresh
	 * http://localhost:8090/say 不生效 why?
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(ConfigclientApplication.class, args);
	}
}
