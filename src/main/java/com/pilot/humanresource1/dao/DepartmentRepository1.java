package com.pilot.humanresource1.dao;

import com.pilot.humanresource1.model.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository1 extends CrudRepository<Department, Integer> {
}
