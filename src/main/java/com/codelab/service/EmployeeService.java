package com.codelab.service;

import com.codelab.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee saveEmployee(Employee employee);
    List<Employee> fetchAllEmployees();
    Employee getEmployeeById(Long id);
    Employee updateEmployeeById(Long id, Employee employee);
    String deleteDepartmentById(Long id);

}
