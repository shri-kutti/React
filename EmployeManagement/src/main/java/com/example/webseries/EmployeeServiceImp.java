package com.example.webseries;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImp implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepo;
    
    @Override
    public String upsertEmployee(EmployeeModel employee) {
        employeeRepo.save(employee);
        return "Success";
    }

    @Override
    public List<EmployeeModel> getAllEmployee() {
        return employeeRepo.findAll();
    }

    @Override
    public EmployeeModel getById(String id) {
        Optional<EmployeeModel> findById = employeeRepo.findById(id);

        if(findById.isPresent())
            return findById.get();
        else
            return null;
    }

    @Override
    public String deleteEmployee(String id) {
        if(employeeRepo.existsById(id)){
            employeeRepo.deleteById(id);
            return "Deleted Successfully";
        } else{
            return "No record found";
        }
    }
}
