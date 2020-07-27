package com.microservice.employees.main;

import com.microservice.employees.model.Employee;
import com.microservice.employees.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class EmployeesApplication {

	@Bean
	public Map<Integer, Employee> employeeMap() {
		return new HashMap<>();
	}

	public static void main(String[] args) {
		SpringApplication.run(EmployeesApplication.class, args);
	}


	//TODO: testing service
	@Bean
	public EmployeeService employeeService() {
		EmployeeService employeeService = new EmployeeService();
		return employeeService;
	}

	@Bean
	public void someTesting() {
		System.out.println(employeeService().maximum_employees);
	}
}
