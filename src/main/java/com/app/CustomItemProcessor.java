package com.app;

import com.app.pojo.*;
import org.springframework.batch.item.ItemProcessor;


public class CustomItemProcessor implements ItemProcessor<Employee, Employee>
{

    public Employee process(Employee employee) throws Exception
    {
        System.out.println("inside processor");
        employee.setSalary(employee.getSalary() + 5000);

        return employee;
    }
}
