package com.microservice.employees;

import com.microservice.employees.model.Employee;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Profile;

import java.util.*;

@SpringBootApplication
@EnableAspectJAutoProxy
public class EmployeesApplication implements CommandLineRunner{

	@Profile("development")
	@Bean
	public Map<Integer, Employee> employeeMapDevelopment() {
		return new HashMap<>();
	}

	@Profile("production")
	@Bean
	public Map<Integer, Employee> employeeMapProduction() {
		return new LinkedHashMap<>();
	}

	@Bean
	public CommandLineRunner commandLineRunner (ApplicationContext context){
		return args ->{
			System.out.println("Beans provided by spring boot\n");

			String[] beanNames = context.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName: beanNames) {
				System.out.println(beanName);
			}
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(EmployeesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		System.out.println("Welcome to Employee microservice");
	}
}
