package com.brijesh.persistence.dataservice.Impl;

import com.brijesh.persistence.dao.IEmployeeDao;
import com.brijesh.persistence.dataservice.IEmployeeDataService;
import com.brijesh.persistence.model.Employee;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class EmployeeDataService implements IEmployeeDataService {

    @Autowired
    private IEmployeeDao employeeDao;

    @Override
    @Transactional
    public void save(Employee employee) {
        employeeDao.create(employee);
    }

    @Override
    @Transactional
    public List<Employee> list() {
        return employeeDao.findAll();
    }
}
