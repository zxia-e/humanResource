package com.pilot.humanresource1.controller;

import com.pilot.humanresource1.model.Employee;
import com.pilot.humanresource1.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private EmployeeService service;
    private EmployeeController dao;


    @GetMapping("/get/{id}")
    public Employee getEmployeeById(@PathVariable int id){

        return service.getEmployeeById(id);
    }

    @GetMapping("/get/all")
    public List<Employee> getAllEmployees() {
        return service.getAllEmployees();
    }

    @PutMapping("/update/{id}")
    public void updateEmployee(@PathVariable int id, @RequestBody Employee temp){
        dao.updateEmployee(id, temp);
    }

    @PostMapping("/new")
    public void addEmployee(@RequestBody Employee temp){
        dao.addEmployee(temp);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEmployeeById(@PathVariable int id){
        dao.deleteEmployeeById(id);
    }

    @DeleteMapping("/delete/all")
    public void deleteAllEmployees() {
        dao.deleteAllEmployees();
    }

    public EmployeeService getService() {
        return service;
    }

    @Autowired
    public void setService(EmployeeService service) {
        this.service = service;
    }
}
