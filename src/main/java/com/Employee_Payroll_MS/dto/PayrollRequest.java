package com.Employee_Payroll_MS.dto;
import lombok.Data;

@Data
public class PayrollRequest {
    private Long employeeId;  // Employee ID  fetch from Db
    private double grossSalary; // Optional:  want to allow custom salary input
}