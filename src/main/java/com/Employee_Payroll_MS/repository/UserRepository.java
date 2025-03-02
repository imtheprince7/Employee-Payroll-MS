package com.Employee_Payroll_MS.repository;

import com.Employee_Payroll_MS.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Long, User> {
    Optional<User> findByEmail(String emailId);
}
