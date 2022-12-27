package com.example.webseries;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeRestController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/addEmployee")
    public ResponseEntity<String> addEmployee(@RequestBody EmployeeModel employee){
        return new ResponseEntity<>(employeeService.upsertEmployee(employee), HttpStatus.ACCEPTED);
    }

    @GetMapping("/getAllEmployee")
    public ResponseEntity<List<EmployeeModel>> getAllEmployee(){
        return new ResponseEntity<>(employeeService.getAllEmployee(),HttpStatus.OK);
    }

    @GetMapping("/getEmployee")
    public ResponseEntity<EmployeeModel> getByID(@RequestParam(name="id") String id){
        return new ResponseEntity<>(employeeService.getById(id),HttpStatus.OK);
    }

    @DeleteMapping("/deleteEmployee")
    public ResponseEntity<String> deleteSeries(@RequestParam(name="id") String id){
        return new ResponseEntity<>(employeeService.deleteEmployee(id),HttpStatus.OK);
    }

}
