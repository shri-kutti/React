package com.example.webseries;

import java.util.List;

public interface EmployeeService {
    public String upsertEmployee(EmployeeModel employee);

    public List<EmployeeModel> getAllEmployee();

    public EmployeeModel getById(String id);

    public String deleteEmployee(String id);


}
