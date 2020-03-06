package com.brijesh.jpa.springboothibernateh2.repository;

import com.brijesh.jpa.springboothibernateh2.entity.Course;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
@Transactional
public class CourseNativeRepository {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    EntityManager entityManager;

    public void native_queries_basic() {
        Query query = entityManager.createNativeQuery(" select * from Course ",Course.class);
        List resultList = query.getResultList();
        logger.info("result list using native_queries_basic-> {}", resultList);
    }

    public void native_query_parameter() {
        Query query = entityManager.createNativeQuery(" select * from Course where id = ?", Course.class);
        query.setParameter(1,10001L);
        List resultList = query.getResultList();
        logger.info("result list using native_query_parameter -> {}", resultList);
    }

    public void native_query_named_parameter() {
        Query query = entityManager.createNativeQuery(" select * from Course where id = :id", Course.class);
        query.setParameter("id",10001L);
        List resultList = query.getResultList();
        logger.info("result list using native_query_named_parameter -> {}", resultList);
    }

    public void native_query_to_update() {
        Query query = entityManager.createNativeQuery(" Update course set last_updated_date=sysdate()", Course.class);
        int rows = query.executeUpdate();
        logger.info("number of rows updated native_query_to_update -> {}", rows);
    }

    public void jpql_where() {
        TypedQuery<Course> query = entityManager.createQuery("select c from Course c where fullname like 'Brijesh%'", Course.class);
        List<Course> resultList = query.getResultList();
        logger.info("select c from Course c where name like '%Brijesh' -> {}", resultList);
    }

    public void jpql_namedquery() {
        Query query = entityManager.createNamedQuery("query_get_all_courses");
        List resultList = query.getResultList();
        logger.info("result list using jpql_namedquery-> {}", resultList);
    }

    public void jpql_where_namedquery() {
        TypedQuery<Course> query = entityManager.createNamedQuery("query_get_brijesh_courses", Course.class);
        List<Course> resultList = query.getResultList();
        logger.info("result list using jpql_where_namedquery -> {}", resultList);
    }

}
