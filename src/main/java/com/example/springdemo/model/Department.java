package com.example.springdemo.model;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Component
public class Department {

    int deptId;
    String name;
    
    public Department(){
        deptId=9001;
        name="Finance";
       
    }

}
