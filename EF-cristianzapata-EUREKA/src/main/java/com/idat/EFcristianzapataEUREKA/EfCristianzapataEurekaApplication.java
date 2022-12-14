package com.idat.EFcristianzapataEUREKA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EfCristianzapataEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfCristianzapataEurekaApplication.class, args);
	}

}
