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
        payroll.setMonth(LocalDate.now());

        return payrollRepository.save(payroll);
    }

    private double calculateTax(double salary) {
        // Tax calculation logic
    }
}