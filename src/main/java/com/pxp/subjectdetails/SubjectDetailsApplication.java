package com.pxp.subjectdetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SubjectDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SubjectDetailsApplication.class, args);
	}

}
