package com.Employee_Payroll_MS.dto;
import lombok.Data;

@Data
public class AuthRequest {
    private String email;
    private String password;
    private String role; // Only  for registration purpose
}
