package com.example.springbootdemo.service;

import com.example.springbootdemo.dao.EmployeeDao;
import com.example.springbootdemo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {
    private EmployeeDao employeeDao;

    @Autowired
    public EmployeeService(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public List<Employee> getAllEmployee() {
        return employeeDao.getAllEmployee();
    }

    public int addEmployee(Employee employee) {
        return employeeDao.addEmployee(new Employee(UUID.randomUUID(), employee.getName(), employee.getAge(), employee.getGender()));
    }

    public Employee getEmployeeById(UUID id) {
        return employeeDao.getEmployeeById(id);
    }

}
