package com.example.springbootWithMysql.service;

import com.example.springbootWithMysql.model.EmployeeDto;

import java.util.List;

public interface EmployeeService {

    List<EmployeeDto> getAllEmployee();

    EmployeeDto addEmployee(EmployeeDto employeeDto);

    String deleteEmployee(Long id);
}
