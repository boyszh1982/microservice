package com.nameless;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ClientSideLoadBalancingWithRibbonApplication {

	/**
	 * 测试启动步骤
	 * java -jar target/configserver-0.0.1-SNAPSHOT.jar
	 * java -jar target/eurekaserver-0.0.1-SNAPSHOT.jar
	 * java -jar target/api2eureka-0.0.1-SNAPSHOT.jar --server.port=8010
	 * java -jar target/api2eureka-0.0.1-SNAPSHOT.jar --server.port=8011
	 * java -jar target/ClientSideLoadBalancingWithRibbon-0.0.1-SNAPSHOT.jar
	 * 
	 * 访问地址
	 * http://localhost:9000/client/show/message -- 客户端
	 * http://localhost:8010/api/show/message -- 负载一
	 * http://localhost:8011/api/show/message -- 负载二
	 * http://localhost:8761/
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(ClientSideLoadBalancingWithRibbonApplication.class, args);
		//new SpringApplicationBuilder(ClientSideLoadBalancingWithRibbonApplication.class).web(false).run(args);
	}
}
