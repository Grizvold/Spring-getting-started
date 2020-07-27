package com.microservice.employees.controllers;

import com.microservice.employees.model.Employee;
import com.microservice.employees.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeRestController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    //TODO: if not found
    @GetMapping("/")
    public ResponseEntity<Employee> getEmployee(@RequestParam Integer employee_id) {
        if (!employeeService.isEmployeeExists(employee_id)) {
            System.out.println("Doesnt exists");
        }

        return new ResponseEntity<>(employeeService.getEmployee(employee_id), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<String> createNewEmployee(@RequestBody Employee employee) {
        ResponseEntity<String> responseEntity;

        responseEntity = new ResponseEntity<>(HttpStatus.OK);
        
        return responseEntity;
    }
}
