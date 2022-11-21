package com.avdhoot.employeemanager.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avdhoot.employeemanager.Entity.Employee;
import com.avdhoot.employeemanager.Service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    
    @Autowired
    private EmployeeService employeeService;


    @GetMapping("/all")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }

    @DeleteMapping("/delete/{id}")
    public void deletEmployee(@PathVariable("id") Long id){
        employeeService.deleteEmployee(id);
    }

    @GetMapping("/get/{id}")
    public Optional<Employee> getEmployee(@PathVariable("id") Long id){
        return employeeService.getEmployee(id);
    }

    @PutMapping("/update")
    public Employee updatEmployee(@RequestBody Employee employee){
        return employeeService.updateEmployee(employee);
    }

}
