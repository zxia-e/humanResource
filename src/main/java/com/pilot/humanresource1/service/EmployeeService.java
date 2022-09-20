package com.pilot.humanresource1.service;

import com.pilot.humanresource1.helper.EmployeeHelper;
import com.pilot.humanresource1.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeHelper helper;

    public Employee getEmployeeById(int id) {

        return helper.getEmployeeById(id);
    }

    public List<Employee> getAllEmployees() {
        return helper.getAllEmployees();
    }

//    public void createEmployee(Employee temp) {
//        repo.newEmployee(repo);
//    }
}
