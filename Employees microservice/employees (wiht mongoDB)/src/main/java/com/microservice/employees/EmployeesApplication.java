package com.microservice.employees;

import com.microservice.employees.document.Employee;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.jms.annotation.EnableJms;

import java.util.*;

@SpringBootApplication
//TODO: add packages
@EnableMongoRepositories
@EnableJms
public class EmployeesApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(EmployeesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		System.out.println("Welcome to Employee microservice");
	}
}
