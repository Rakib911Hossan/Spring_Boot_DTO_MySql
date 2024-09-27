package com.example.springbootWithMysql.service.impl;

import com.example.springbootWithMysql.entity.EmployeeEntity;
import com.example.springbootWithMysql.mapper.EmployeeMapper;
import com.example.springbootWithMysql.model.EmployeeDto;
import com.example.springbootWithMysql.repository.EmployeeRepository;
import com.example.springbootWithMysql.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<EmployeeDto> getAllEmployee() {
        List<EmployeeEntity> employeeEntities = employeeRepository.findAll();
        return employeeMapper.mapTOEmployeeDtos(employeeEntities);
    }

    @Override
    public EmployeeDto addEmployee(EmployeeDto employeeDto) {
        EmployeeEntity employeeEntity = employeeMapper.mapToEmployeeEntity(employeeDto);
        EmployeeEntity empEntityResponse = employeeRepository.save(employeeEntity);
        EmployeeDto response = employeeMapper.mapToEmployeeDto(empEntityResponse);
        return response;
    }

    @Override
    public String deleteEmployee(Long id) {
        employeeRepository.deleteAllById(Collections.singleton(id));
        return "Employee Deleted Successfully.";
    }


}
