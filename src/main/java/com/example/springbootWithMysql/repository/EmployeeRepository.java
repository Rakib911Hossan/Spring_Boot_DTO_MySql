package com.example.springbootWithMysql.repository;

import com.example.springbootWithMysql.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
}
