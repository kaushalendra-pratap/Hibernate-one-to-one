package com.sunglowsys.test;

import com.sunglowsys.service.EmployeeServiceImpl;

public class EmployeeDelete {
    public static void main(String[] args){
        new EmployeeServiceImpl().delete(2l);

    }
}
