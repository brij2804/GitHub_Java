package com.brijesh.persistence.dataservice;

import com.brijesh.persistence.model.Employee;

import java.util.List;

public interface IEmployeeDataService {

    void save(Employee employee);

    List<Employee> list();
}
