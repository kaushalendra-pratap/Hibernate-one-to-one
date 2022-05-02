package com.sunglowsys.repository;

import com.sunglowsys.domain.Employee;

import java.util.List;

public interface EmployeeRepository {

    void save(Employee employee);

    void update(Employee employee,long id);

    List<Employee> findAll();

    Employee findById(Long id);

    void delete(long id);
}
