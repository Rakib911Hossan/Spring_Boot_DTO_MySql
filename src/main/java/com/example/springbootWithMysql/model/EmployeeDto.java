package com.example.springbootWithMysql.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {

    private String name;

    private Integer age;

    private Integer salary;

    private String address;
}
