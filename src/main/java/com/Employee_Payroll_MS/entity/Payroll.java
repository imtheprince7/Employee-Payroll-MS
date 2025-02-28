package com.Employee_Payroll_MS.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payroll {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double grossSalary;
    private double tax;
    private double netSalary;
    private LocalDate month;

    @ManyToOne
    private Employee employee;
}
