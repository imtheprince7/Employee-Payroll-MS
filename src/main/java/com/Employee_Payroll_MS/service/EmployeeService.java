package com.Employee_Payroll_MS.service;

import com.Employee_Payroll_MS.entity.Employee;
import com.Employee_Payroll_MS.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee addEmployee(Employee employee) {
        if (employeeRepository.existsByEmail(employee.getEmail())) {
            throw new RuntimeException("Employee already registered !");
        }
        return employeeRepository.save(employee);
    }

    // Find an employee by email
    public Employee getEmployeeByEmail(String email) {
        Optional<Employee> employee = employeeRepository.findByEmail(email);
        return employee.orElseThrow(() -> new RuntimeException("Employee not found!"));
    }

    // Get total count of employees
    public long getTotalEmployees() {
        return employeeRepository.count();
    }

}
