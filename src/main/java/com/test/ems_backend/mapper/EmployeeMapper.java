package com.test.ems_backend.mapper;

import com.test.ems_backend.dto.EmployeeDto;
import com.test.ems_backend.entity.Employee;

public class EmployeeMapper {

    public static EmployeeDto maptoEmployeeDto(Employee employee) {
        return new EmployeeDto(
            employee.getId(),
            employee.getFirst_name(),
            employee.getLast_name(),
            employee.getEmail()
        );
    }

    public static Employee maptoEmployee(EmployeeDto employeeDto) {
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirst_name(),
                employeeDto.getLast_name(),
                employeeDto.getEmail()
        );
    }
}
