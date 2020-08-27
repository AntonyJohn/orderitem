package com.antony.orderitem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableAutoConfiguration
@EnableFeignClients
public class OrderitemApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderitemApplication.class, args);
	}

}
