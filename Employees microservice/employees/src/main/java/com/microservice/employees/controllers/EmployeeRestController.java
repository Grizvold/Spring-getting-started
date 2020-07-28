package com.microservice.employees.controllers;

import com.microservice.employees.exeptionhandling.EmployeeServiceException;
import com.microservice.employees.exeptionhandling.ResourceNotFoundException;
import com.microservice.employees.model.Employee;
import com.microservice.employees.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping(value = "/employees")
public class EmployeeRestController {

    @Autowired
    private EmployeeService employeeService;

    private Logger logger = LoggerFactory.getLogger(EmployeeRestController.class);
    private ResponseEntity<?> responseEntity;

    @GetMapping(value = "/get_all")
    public Map<Integer, Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping
    public ResponseEntity<Employee> getEmployee(@RequestParam(value = "employee_id") Integer employee_id)
            throws ResourceNotFoundException, EmployeeServiceException {
        logger.debug("GET mapping, method =  getEmployee()");
            try {
                Employee employee = employeeService.getEmployee(employee_id);
                if (null == employee) {
                    throw new ResourceNotFoundException("Employee not found");
                }
                responseEntity = new ResponseEntity<>(employee, HttpStatus.OK);

            } catch (EmployeeServiceException e) {
                throw new EmployeeServiceException("Internal Server Exception while getting exception");
            }

                return (ResponseEntity<Employee>) responseEntity;
    }

    @PostMapping
    public ResponseEntity<String> createNewEmployee(@RequestBody Employee employee) {
        logger.debug("POST mapping, method =  createNewEmployee()");
        if (true == employeeService.isEmployeeListFull()) {
            logger.debug("Employee list is full.");
            responseEntity = new ResponseEntity<>("max employees reached", HttpStatus.NOT_ACCEPTABLE);
        } else {
            employeeService.createEmployee(employee);
            responseEntity = new ResponseEntity<>("New employee was successfully created", HttpStatus.OK);
        }

        return (ResponseEntity<String>) responseEntity;
    }

    @PutMapping
    public ResponseEntity<String> updateEmployeeInfo(@RequestParam(value = "employee_id") Integer employee_id,
                                                     @RequestBody Employee employee) throws ResourceNotFoundException, EmployeeServiceException {
        logger.debug("PUT mapping, method =  updateEmployeeInfo()");
        try {
            if (false == employeeService.isEmployeeExists(employee_id)) {
                throw new ResourceNotFoundException("Employee not found");
            }
            employeeService.updateEmployee(employee_id, employee);
            responseEntity = new ResponseEntity<>("Employee was successfully updated.", HttpStatus.OK);

        } catch (EmployeeServiceException e) {
            throw new EmployeeServiceException("Internal Server Exception while getting exception");
        }



        return (ResponseEntity<String>) responseEntity;
    }

    @DeleteMapping
    public ResponseEntity<String> deleteEmployee(@RequestParam(value = "employee_id") Integer employee_id) throws ResourceNotFoundException, EmployeeServiceException {
        logger.debug("DELETE mapping, method =  deleteEmployee()");
        try {
            if (false == employeeService.isEmployeeExists(employee_id)) {
                throw new ResourceNotFoundException("Employee not found");
            }
            employeeService.deleteEmployee(employee_id);
            responseEntity = new ResponseEntity<>("Employee was successfully deleted.", HttpStatus.OK);

        } catch (EmployeeServiceException e) {
            throw new EmployeeServiceException("Internal Server Exception while getting exception");
        }

        return (ResponseEntity<String>) responseEntity;
    }
}
