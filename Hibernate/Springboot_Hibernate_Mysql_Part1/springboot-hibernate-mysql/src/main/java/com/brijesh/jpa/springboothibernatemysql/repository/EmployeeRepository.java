package com.brijesh.jpa.springboothibernatemysql.repository;

import com.brijesh.jpa.springboothibernatemysql.entity.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

    List<Employee> findByName(String name);
}
