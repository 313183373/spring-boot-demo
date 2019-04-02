package com.example.springbootdemo.dao;

import com.example.springbootdemo.model.Employee;

import java.util.List;
import java.util.UUID;

public interface EmployeeDao {
    List<Employee> getAllEmployee();

    int addEmployee(Employee employee);

    Employee getEmployeeById(UUID id);

    int updateEmployeeById(UUID id);

    int deleteEmployeeById(UUID id);
}
