package com.Employee_Payroll_MS.service;

import com.Employee_Payroll_MS.dto.PayrollRequest;
import com.Employee_Payroll_MS.entity.Employee;
import com.Employee_Payroll_MS.entity.Payroll;
import com.Employee_Payroll_MS.repository.EmployeeRepository;
import com.Employee_Payroll_MS.repository.PayrollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class PayrollService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private PayrollRepository payrollRepository;

    public Payroll calculatePayroll(PayrollRequest request) {
// Fetching employee from database using the ID
        Employee employee = employeeRepository.findById(request.getEmployeeId())
                .orElseThrow(() -> new RuntimeException("Employee not found!"));

// Calculating tax based on employee's salary from the Db
        double tax = calculateTax(employee.getSalary());
        double netSalary = employee.getSalary() - tax;

// Creating &  saving payroll
        Payroll payroll = new Payroll();
        payroll.setEmployee(employee);
        payroll.setGrossSalary(employee.getSalary()); // salary from Employee entity-class
        payroll.setTax(tax);
        payroll.setNetSalary(netSalary);
        payroll.setPayDate(LocalDate.now());

        return payrollRepository.save(payroll);
    }

    private double calculateTax(double salary) {
        if( salary >= 50000 &&  salary <= 80000 ) return salary * 0.05;
        else if( salary > 80000 &&  salary <= 120000) return salary * 0.1;
        else if( salary > 120000 &&  salary <= 160000) return salary * 0.15;
        else if( salary > 160000 &&  salary <= 200000) return salary * 0.20;
        else return salary * 0.25;
    }
}