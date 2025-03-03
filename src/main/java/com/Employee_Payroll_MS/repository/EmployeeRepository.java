package com.Employee_Payroll_MS.repository;

import com.Employee_Payroll_MS.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Optional<Employee> findByEmail(String email);

    // Check if employee exists by email or not
    boolean existsByEmail(String email);
}