package com.microservice.employees.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.microservice.employees.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class EmployeeService {
    @Autowired
    private Map<Integer, Employee> employeeMap;

    @Value("${maximum_employees}")
    public int maximum_employees;

    public void createEmployee(Employee employee) {
        employeeMap.put(employee.getId(), employee);
    }

    public void updateEmployee(Integer employee_id, Employee employee) {
        employeeMap.put(employee_id, employee);
    }

    public void deleteEmployee(Integer employee_id) {
        employeeMap.remove(employee_id);
    }

    public Employee getEmployee(Integer employee_id) {
        Employee employee = employeeMap.get(employee_id);
        Double salary_ILS = salaryConverter_USD_to_ILS(employee.getSalary());

        return new Employee(employee.getName(),
                            employee.getCountry(),
                            employee.getCity(),
                            salary_ILS,
                            employee.getId());
    }

    //TODO: check what's the difference if return map itself
    public List<Employee> getAllEmployees() {
        List<Employee> employeeList = new ArrayList<>();

        for (Employee employee: employeeMap.values()) {
            employeeList.add(getEmployee(employee.getId()));
        }
        
        return employeeList;
    }

    public boolean isEmployeeExists(Integer employee_id) {
        return employeeMap.containsKey(employee_id);
    }

    public boolean isEmployeeListFull() {
        return employeeMap.size() < maximum_employees;
    }

    private Double salaryConverter_USD_to_ILS(Double salary_USD) {

        RestTemplate restTemplate = new RestTemplate();
        String converter_URL = "https://free.currconv.com/api/v7/convert?q=USD_ILS&compact=ultra&apiKey=b5c63df7a95099b06654";
        String coin_type = "USD_ILS";

        ResponseEntity<Map> responseEntity = restTemplate.getForEntity(converter_URL, Map.class);
        Map<String, Double> responseData = responseEntity.getBody();

        return responseData.get(coin_type) * salary_USD;
    }
}