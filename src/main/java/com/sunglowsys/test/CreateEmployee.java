package com.sunglowsys.test;

import com.sunglowsys.domain.Address;
import com.sunglowsys.domain.Employee;
import com.sunglowsys.service.EmployeeServiceImpl;

public class CreateEmployee {
    public static void main(String[] args) {
        Address address = new Address("noida","up","india",2071208L);
        Employee employee = new Employee("amit","singh","amit@gmail.com","54577889896L");
        employee.setAddress(address);
        new EmployeeServiceImpl().save(employee);
    }
}
