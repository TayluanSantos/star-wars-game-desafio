package com.tayluan.starwargame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.reactive.config.EnableWebFlux;
import reactivefeign.spring.config.EnableReactiveFeignClients;


@SpringBootApplication
@EnableFeignClients
public class StarWarApplication {
	public static void main(String[] args) {
		SpringApplication.run(StarWarApplication.class, args);
	}
}
