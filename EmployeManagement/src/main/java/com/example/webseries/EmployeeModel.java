package com.example.webseries;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name="emp_table")
public class EmployeeModel {
    @Id
    private String employeeId;
    private String employeeName;
    private String employeeEmail;
    private String dept;

}
