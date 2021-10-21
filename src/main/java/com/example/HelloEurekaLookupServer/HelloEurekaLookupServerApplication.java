package com.example.HelloEurekaLookupServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class HelloEurekaLookupServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloEurekaLookupServerApplication.class, args);
	}

}
