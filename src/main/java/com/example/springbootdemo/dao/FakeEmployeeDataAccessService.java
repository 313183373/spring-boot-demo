package com.example.springbootdemo.dao;

import com.example.springbootdemo.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FakeEmployeeDataAccessService implements EmployeeDao {
    private List<Employee> DB = new ArrayList<>();

    @Override
    public List<Employee> getAllEmployee() {
        return DB;
    }

    @Override
    public int addEmployee(Employee employee) {
        DB.add(employee);
        return 1;
    }

}
