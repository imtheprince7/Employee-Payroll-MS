package com.Employee_Payroll_MS.entity;

import jakarta.persistence.*;

import javax.management.relation.Role;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String email;
    private String role;       // For ADMIN, EMPLOYEE purpose
}
