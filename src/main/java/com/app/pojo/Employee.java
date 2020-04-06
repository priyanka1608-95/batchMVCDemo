package com.app.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee
{
    private int id;
    private String name;
    private float salary;

    public Employee() {
    }
}
