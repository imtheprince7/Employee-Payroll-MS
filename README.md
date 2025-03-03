# Employee-Payroll-MS
A secure, cloud-native payroll system designed to automate "salary calculations", "tax deductions", and "payslip generation" for enterprises. 
Built with Spring Boot, Firebase Firestore, and React.
it streamlines HR workflows with role-based access (Admin/Employee) and integrates real-time data synchronization for seamless payroll processing.


# Employee Payroll Management System

A secure, cloud-based payroll system built with **Spring Boot** for automating salary calculations and employee management. Designed to mirror enterprise-level HR solutions like UKG's workforce management tools.

[![Java](https://img.shields.io/badge/Java-17-blue)](https://java.com)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.1-green)](https://spring.io)
[![PostgreSQL](https://img.shields.io/badge/PostgreSQL-15-orange)](https://postgresql.org)
[![Heroku](https://img.shields.io/badge/Deployed_on-Heroku-6762a6)](https://heroku.com)


## Key Features
- **Role-Based Access Control** (Admin/Employee)  
- **Automated Payroll Calculations** with tax deductions  
- **JWT Authentication** for secure API endpoints  
- **RESTful APIs** for seamless integration

## Tech Stack
| Category       | Technologies                          |
|----------------|---------------------------------------|
| **Backend**    | Spring Boot, Spring Security, JPA     |
| **Database**   | MySQL                                 |
| **Security**   | JWT, BCrypt Password Encoding         |
| **Deployment** | Working*                              |

## ⚙️ Installation
**Prerequisites**: Java 17+, Maven, PostgreSQL


1. **Clone the repository**:
   ```bash
   git clone https://github.com/imtheprince7/Employee-Payroll-MS.git


## API Endpoints
Method	  Endpoint	                Description
POST	/api/auth/register	    Register new users (Admin role)
POST	/api/auth/login	        Generate JWT token
POST	/api/employees	        Add new employees (Admin-only)
POST	/api/payroll/calculate	Calculate salary with tax deductions
