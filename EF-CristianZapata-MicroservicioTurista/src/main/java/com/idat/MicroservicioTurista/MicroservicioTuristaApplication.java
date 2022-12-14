package com.idat.MicroservicioTurista;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.idat.EFcristianzapataEUREKA.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MicroservicioTuristaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioTuristaApplication.class, args);
	}

}
