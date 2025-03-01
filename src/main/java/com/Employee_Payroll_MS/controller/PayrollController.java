package com.Employee_Payroll_MS.controller;

import com.Employee_Payroll_MS.dto.PayrollRequest;
import com.Employee_Payroll_MS.entity.Payroll;
import com.Employee_Payroll_MS.service.PayrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payroll")
public class PayrollController {
    @Autowired
    private PayrollService payrollService;

    @PostMapping("/calculate")
    public ResponseEntity<Payroll> calculatePayroll(@RequestBody PayrollRequest request) {
        return ResponseEntity.ok(payrollService.calculatePayroll(request));
    }

//    @GetMapping("/{employeeId}/payslip")
//    public ResponseEntity<ByteArrayResource> generatePayslip(@PathVariable String employeeId) {
//        // Returns PDF as a downloadable file
//
//    }

}