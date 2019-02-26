package com.brijesh.persistence.dao;

import com.brijesh.persistence.dao.common.IOperations;
import com.brijesh.persistence.model.Employee;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeDao extends IOperations<Employee> {

}
