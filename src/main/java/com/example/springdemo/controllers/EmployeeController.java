package com.example.springdemo.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.example.springdemo.model.Department;
import com.example.springdemo.model.Employee;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class EmployeeController {
    
    
    private Department department;

    public EmployeeController(Department department){
        this.department=department;
    }

    @GetMapping("/employee")
    public Employee getEmployee() {
        return new Employee(10001,"Praveen","Manager",department);
    }
    
}
