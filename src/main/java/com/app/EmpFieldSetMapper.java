package com.app;

import com.app.pojo.Employee;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

public class EmpFieldSetMapper implements FieldSetMapper<Employee>
{
    public Employee mapFieldSet(FieldSet fieldSet) throws BindException
    {
        Employee emp=new Employee();

        emp.setId(fieldSet.readInt(0));
        emp.setName(fieldSet.readString(1));
        emp.setSalary(fieldSet.readFloat(2));

        return emp;
    }
}
