//package com.Employee_Payroll_MS.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//    @Autowired
//    private JwtUtil jwtUtil;
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http
//                .csrf().disable()
//                .authorizeRequests()
//                .antMatchers("/api/auth/**").permitAll()
//                .antMatchers("/api/employees/**").hasRole("ADMIN")
//                .antMatchers("/api/payroll/**").hasAnyRole("ADMIN", "EMPLOYEE")
//                .anyRequest().authenticated()
//                .and()
//                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//                .and()
//                .addFilterBefore(jwtFilter(), UsernamePasswordAuthenticationFilter.class);
//        return http.build();
//    }
//}