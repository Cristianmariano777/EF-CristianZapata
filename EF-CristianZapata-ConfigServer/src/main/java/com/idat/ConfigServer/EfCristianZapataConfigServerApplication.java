package com.idat.ConfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class EfCristianZapataConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfCristianZapataConfigServerApplication.class, args);
	}

}
