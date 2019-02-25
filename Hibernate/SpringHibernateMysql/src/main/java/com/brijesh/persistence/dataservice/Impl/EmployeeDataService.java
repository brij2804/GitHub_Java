package com.brijesh.persistence.dataservice.Impl;

import com.brijesh.persistence.dao.IEmployeeDao;
import com.brijesh.persistence.model.Employee;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class EmployeeDataService {

    @Autowired
    private IEmployeeDao employeeDao;

    @Transactional
    public void save(Employee employee) {
        employeeDao.create(employee);
    }

    @Transactional
    public List<Employee> list() {
        return employeeDao.findAll();
    }
}
