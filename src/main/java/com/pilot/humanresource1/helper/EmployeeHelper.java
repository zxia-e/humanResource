package com.pilot.humanresource1.helper;

import com.pilot.humanresource1.dao.EmployeeRepository;
import com.pilot.humanresource1.dao.EmployeeRepository1;
import com.pilot.humanresource1.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeHelper {

    private EmployeeRepository repo;

    @Autowired
    private EmployeeRepository1 repo1;

    @Autowired
    public EmployeeHelper(EmployeeRepository repo) {

        this.repo = repo;
    }

    public Employee getEmployeeById(int id) {
        return repo1.findById(id).orElse(null);
//        return repo.getEmployeeById(id);
    }

    public List<Employee> getAllEmployees() {
//        return repo1.findAll();
        return repo.getAllEmployees();
//        return (List<Employee>) repo.findAll();
    }
}
