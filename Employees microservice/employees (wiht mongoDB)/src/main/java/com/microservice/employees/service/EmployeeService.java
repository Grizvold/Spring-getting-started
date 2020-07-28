package com.microservice.employees.service;

import com.microservice.employees.exeptionhandling.EmployeeServiceException;
import com.microservice.employees.document.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

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

    public Employee getEmployee(Integer employee_id) throws EmployeeServiceException {
        if (false == isEmployeeExists(employee_id)) {
            return null;
        }
        Employee employee = employeeMap.get(employee_id);
        Double salary_ILS = salaryConverter(employee.getSalary());

        return new Employee(employee.getName(),
                            employee.getCountry(),
                            employee.getCity(),
                            salary_ILS,
                            employee.getId());
    }

    public Map<Integer, Employee> getAllEmployees() {
        return employeeMap;
    }

    public boolean isEmployeeExists(Integer employee_id) throws EmployeeServiceException {
        if (false == employeeMap.containsKey(employee_id)) {
            throw new EmployeeServiceException();
        }
        return true;
    }

    public boolean isEmployeeListFull() {
        return employeeMap.size() >= maximum_employees;
    }

    private Double salaryConverter(Double salary_USD) {
        RestTemplate restTemplate = new RestTemplate();
        String converter_URL = "https://free.currconv.com/api/v7/convert?q=USD_ILS&compact=ultra&apiKey=b5c63df7a95099b06654";
        String coin_type = "USD_ILS";

        ResponseEntity<Map> responseEntity = restTemplate.getForEntity(converter_URL, Map.class);
        Map<String, Double> responseData = responseEntity.getBody();

        return responseData.get(coin_type) * salary_USD;
    }
}
