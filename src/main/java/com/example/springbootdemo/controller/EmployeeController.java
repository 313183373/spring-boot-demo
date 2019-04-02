package com.example.springbootdemo.controller;

import com.example.springbootdemo.model.Employee;
import com.example.springbootdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<Employee> getAllEmployee() {
        return employeeService.getAllEmployee();
    }

    @PostMapping
    public void addEmployee(@Valid @NotNull @RequestBody Employee employee) {
        employeeService.addEmployee(employee);
    }

    @GetMapping(path = "{id}")
    public Employee getEmployeeById(@PathVariable("id") UUID id) {
        return employeeService.getEmployeeById(id);
    }

    @PutMapping(path = "{id}")
    public void updateEmployeeById(@PathVariable("id") UUID id, @Valid @NotNull @RequestBody Employee employee) {
        employeeService.updateEmployeeById(id, employee);
    }

    @DeleteMapping(path = "{id}")
    public void deleteEmployeeById(@PathVariable("id") UUID id) {
        employeeService.deleteEmployeeById(id);
    }
}