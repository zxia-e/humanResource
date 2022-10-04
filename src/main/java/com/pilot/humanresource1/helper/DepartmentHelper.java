package com.pilot.humanresource1.helper;

import com.pilot.humanresource1.dao.DepartmentRepository;

import com.pilot.humanresource1.dao.DepartmentRepository1;
import com.pilot.humanresource1.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DepartmentHelper {
    private DepartmentRepository repo;

    @Autowired
    private DepartmentRepository1 repo1;
    @Autowired
    public DepartmentHelper(DepartmentRepository repo) {
        this.repo = repo;
    }

    public Department getDepartmentById(int id) {
        return repo1.findById(id).orElse(null);
    }

    public List<Department> getAllDepartments() {
        return repo.getAllDepartments();
    }
}
