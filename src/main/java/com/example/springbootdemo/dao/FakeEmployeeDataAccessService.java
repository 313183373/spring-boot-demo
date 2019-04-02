package com.example.springbootdemo.dao;

import com.example.springbootdemo.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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

    @Override
    public Employee getEmployeeById(UUID id) {
        return DB.stream().filter(employee -> employee.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public int updateEmployeeById(UUID id, Employee employee) {
        Employee e = getEmployeeById(id);
        if (e == null) {
            return 0;
        }
        int indexOfUpdateEmployee = DB.indexOf(e);
        DB.set(indexOfUpdateEmployee, new Employee(id, employee.getName(), employee.getAge(), employee.getGender()));
        return 1;
    }

    @Override
    public int deleteEmployeeById(UUID id) {
        return 0;
    }

}
