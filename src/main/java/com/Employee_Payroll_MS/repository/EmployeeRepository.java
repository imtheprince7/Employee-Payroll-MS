package com.Employee_Payroll_MS.repository;

import com.Employee_Payroll_MS.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    boolean findByEmail(String email);
    boolean existsByEmail(String email);
}
