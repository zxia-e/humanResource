package com.pilot.humanresource1.helper;

import com.pilot.humanresource1.dao.DepartmentRepository;

import com.pilot.humanresource1.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DepartmentHelper {
    private DepartmentRepository repo;

    @Autowired
    public DepartmentHelper(DepartmentRepository repo) {
        this.repo = repo;
    }

    public Department getDepartmentById(int id) {
        return repo.getDepartmentById(id);
    }

    public List<Department> getAllDepartments() {
        return repo.getAllDepartments();
    }
}
