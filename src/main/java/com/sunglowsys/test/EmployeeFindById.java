package com.sunglowsys.test;

import com.sunglowsys.domain.Employee;
import com.sunglowsys.service.EmployeeServiceImpl;

public class EmployeeFindById {
    public static void main(String[] args) {
        Employee employee = new EmployeeServiceImpl().findById(1l);
        System.out.println(employee);
    }
}
