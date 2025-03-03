package com.Employee_Payroll_MS.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Implement logic to fetch user details from database
        // Example: Fetch user from repository and map it to UserDetails
        throw new UsernameNotFoundException("User not found: " + username);
    }
}
