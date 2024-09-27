package com.example.springbootWithMysql.controller;

import com.example.springbootWithMysql.model.EmployeeDto;
import com.example.springbootWithMysql.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value="/getEmployee")
    public List<EmployeeDto> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    @PostMapping(value="/addEmployee")
    public EmployeeDto addEmployee(@RequestBody EmployeeDto employeeDto){
        return employeeService.addEmployee(employeeDto);
    }

    @DeleteMapping(value="/employee/{id}")
    public String deleteEmployee(@PathVariable Long id ){
        return employeeService.deleteEmployee(id);
    }
    
}
