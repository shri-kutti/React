package com.example.webseries;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface EmployeeRepository extends JpaRepository<EmployeeModel, Serializable>{
}
