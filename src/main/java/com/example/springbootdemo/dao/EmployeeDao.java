package com.example.springbootdemo.dao;

import com.example.springbootdemo.model.Employee;

import java.util.List;

public interface EmployeeDao {
    List<Employee> getAllEmployee();

    int addEmployee(Employee employee);
}
