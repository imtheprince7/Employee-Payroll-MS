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
    @Enumerated(EnumType.STRING)
    private Role role;

    public enum Role {
        ADMIN, EMPLOYEE
    }

}
