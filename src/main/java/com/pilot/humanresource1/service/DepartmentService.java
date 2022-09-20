package com.pilot.humanresource1.service;

import com.pilot.humanresource1.helper.DepartmentHelper;
import com.pilot.humanresource1.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentHelper helper;

    public Department getDepartmentById(int id) {
        return helper.getDepartmentById(id);
    }

    public List<Department> getAllDepartment() {
        return helper.getAllDepartments();
    }
}
