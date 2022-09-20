package com.pilot.humanresource1.dao;

import com.pilot.humanresource1.model.Department;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DepartmentRepository {

    static List<Department> department;

    static {
        department = new ArrayList<>();
        department.add(new Department(1, "New York"));
        department.add(new Department(2, "New Jersey"));
    }

    public List<Department> getAllDepartments() {
        return department;
    }
    public Department getDepartmentById(int id) {
        return department.stream().filter(e -> id == e.getId()).findFirst().orElse(null);
    }
}
