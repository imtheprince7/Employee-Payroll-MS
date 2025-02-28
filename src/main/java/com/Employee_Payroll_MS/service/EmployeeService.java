package com.Employee_Payroll_MS.service;

import com.Employee_Payroll_MS.entity.Employee;
import com.Employee_Payroll_MS.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee addEmployee(Employee employee) {
        if (employeeRepository.findByEmail(employee.getEmail())) {
            throw new RuntimeException("Email already exists!");
        }
        return employeeRepository.save(employee);
    }
}
