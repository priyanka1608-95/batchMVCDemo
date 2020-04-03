package com.app;

import com.app.pojo.employee;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

public class EmpFieldSetMapper implements FieldSetMapper<employee>
{
    public employee mapFieldSet(FieldSet fieldSet) throws BindException
    {
        employee emp=new employee();

        emp.setId(fieldSet.readInt(0));
        emp.setName(fieldSet.readString(1));
        emp.setSalary(fieldSet.readFloat(2));

        return emp;
    }
}
