package com.brijesh.persistence.dao.Impl;

import com.brijesh.persistence.dao.IEmployeeDao;
import com.brijesh.persistence.dao.common.AbstractHibernateDao;
import com.brijesh.persistence.model.Employee;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao extends AbstractHibernateDao<Employee> implements IEmployeeDao {

    public EmployeeDao() {
        super();
        setClazz(Employee.class);
    }

}
