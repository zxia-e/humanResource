package com.pilot.humanresource1.controller;

import com.pilot.humanresource1.model.Department;
import com.pilot.humanresource1.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    private DepartmentService service;

    @GetMapping("/get/{id}")
    public Department getDepartmentById(@PathVariable int id) {
        return service.getDepartmentById(id);
    }

    @GetMapping("/get/all")
    public List<Department> getAllDepartment() {
        return service.getAllDepartment();
    }

    public DepartmentService getService() {
        return service;
    }

    @Autowired
    public void setService(DepartmentService service) {
        this.service = service;
    }
}
