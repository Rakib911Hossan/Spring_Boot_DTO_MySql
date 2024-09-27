package com.example.springbootWithMysql.mapper;

import com.example.springbootWithMysql.entity.EmployeeEntity;
import com.example.springbootWithMysql.model.EmployeeDto;
import org.hibernate.annotations.Comment;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface EmployeeMapper {

    @Mappings({@Mapping(source = "name", target = "name")})
    EmployeeDto mapToEmployeeDto(EmployeeEntity employeeEntity);

    EmployeeEntity mapToEmployeeEntity(EmployeeDto employeeDto);

    List<EmployeeDto> mapTOEmployeeDtos(List<EmployeeEntity> employeeEntities);

    List<EmployeeEntity> mapTOEmployeeEntities(List<EmployeeDto> employeeEntities);
}
