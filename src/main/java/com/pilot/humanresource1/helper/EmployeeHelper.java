package com.pilot.humanresource1.helper;

import com.pilot.humanresource1.dao.EmployeeRepository;
import com.pilot.humanresource1.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeHelper {
    private EmployeeRepository repo;


    @Autowired
    public EmployeeHelper(EmployeeRepository repo) {

        this.repo = repo;
    }

    public Employee getEmployeeById(int id) {

        return repo.getEmployeeById(id);
    }

    public List<Employee> getAllEmployees() {
        return repo.getAllEmployees();
    }
}
