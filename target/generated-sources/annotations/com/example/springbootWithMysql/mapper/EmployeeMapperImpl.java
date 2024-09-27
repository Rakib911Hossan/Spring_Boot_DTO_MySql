package com.example.springbootWithMysql.mapper;

import com.example.springbootWithMysql.entity.EmployeeEntity;
import com.example.springbootWithMysql.model.EmployeeDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-21T15:02:48+0600",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class EmployeeMapperImpl implements EmployeeMapper {

    @Override
    public EmployeeDto mapToEmployeeDto(EmployeeEntity employeeEntity) {
        if ( employeeEntity == null ) {
            return null;
        }

        EmployeeDto employeeDto = new EmployeeDto();

        employeeDto.setName( employeeEntity.getName() );
        employeeDto.setAge( employeeEntity.getAge() );
        employeeDto.setSalary( employeeEntity.getSalary() );
        employeeDto.setAddress( employeeEntity.getAddress() );

        return employeeDto;
    }

    @Override
    public EmployeeEntity mapToEmployeeEntity(EmployeeDto employeeDto) {
        if ( employeeDto == null ) {
            return null;
        }

        EmployeeEntity employeeEntity = new EmployeeEntity();

        employeeEntity.setName( employeeDto.getName() );
        employeeEntity.setAge( employeeDto.getAge() );
        employeeEntity.setSalary( employeeDto.getSalary() );
        employeeEntity.setAddress( employeeDto.getAddress() );

        return employeeEntity;
    }

    @Override
    public List<EmployeeDto> mapTOEmployeeDtos(List<EmployeeEntity> employeeEntities) {
        if ( employeeEntities == null ) {
            return null;
        }

        List<EmployeeDto> list = new ArrayList<EmployeeDto>( employeeEntities.size() );
        for ( EmployeeEntity employeeEntity : employeeEntities ) {
            list.add( mapToEmployeeDto( employeeEntity ) );
        }

        return list;
    }

    @Override
    public List<EmployeeEntity> mapTOEmployeeEntities(List<EmployeeDto> employeeEntities) {
        if ( employeeEntities == null ) {
            return null;
        }

        List<EmployeeEntity> list = new ArrayList<EmployeeEntity>( employeeEntities.size() );
        for ( EmployeeDto employeeDto : employeeEntities ) {
            list.add( mapToEmployeeEntity( employeeDto ) );
        }

        return list;
    }
}
