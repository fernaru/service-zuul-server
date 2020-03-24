package com.co.kerbero.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableEurekaClient
@EnableCircuitBreaker
@SpringBootApplication
public class ServiceZuulServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceZuulServerApplication.class, args);
	}

}
