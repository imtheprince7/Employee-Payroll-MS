package com.Employee_Payroll_MS.dto;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthResponse {
    private String token;
//    private String email;
//    private String role;
    private String message;


}
