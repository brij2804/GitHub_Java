package com.brijesh.persistence.dataservice;

import com.brijesh.persistence.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IEmployeeDataService {

    void save(Employee employee);

    List<Employee> list();
}
