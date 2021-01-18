package com.gaurav.department;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UserDepartmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserDepartmentApplication.class, args);
	}

}
