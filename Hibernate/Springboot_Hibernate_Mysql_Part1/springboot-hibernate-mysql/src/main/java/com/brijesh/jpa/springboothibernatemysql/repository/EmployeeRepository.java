package com.brijesh.jpa.springboothibernatemysql.repository;

import com.brijesh.jpa.springboothibernatemysql.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

    List<Employee> findByName(String name);
}
