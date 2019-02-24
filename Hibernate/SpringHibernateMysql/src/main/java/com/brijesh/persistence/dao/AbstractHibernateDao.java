package com.brijesh.persistence.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;

public abstract class AbstractHibernateDao <T extends Serializable> extends AbstractDao<T> implements IOperations<T>{

    @Autowired
    protected SessionFactory sessionFactory;

    @Override
    public T findOne(final long id){

    }
}
