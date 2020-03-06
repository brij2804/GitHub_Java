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
public class CourseJPQLRepository {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    EntityManager entityManager;

    public void jpql_basic() {
        Query query = entityManager.createQuery(" select c from Course c");
        List resultList = query.getResultList();
        logger.info("result list using jpql_basic-> {}", resultList);
    }

    public void jpql_typedQuery() {
        TypedQuery<Course> query = entityManager.createQuery(" select c from Course c", Course.class);
        List<Course> resultList = query.getResultList();
        logger.info("result list using jpql_typedQuery -> {}", resultList);
    }

    public void jpql_where() {
        TypedQuery<Course> query = entityManager.createQuery("select c from Course c where name like '%Brijesh'", Course.class);
        List<Course> resultList = query.getResultList();
        logger.info("select c from Course c where name like '%Brijesh' -> {}", resultList);
    }

    public void jpql_namedquery() {
        Query query = entityManager.createNamedQuery("query_get_all_courses");
        List resultList = query.getResultList();
        logger.info("result list using jpql_namedquery-> {}", resultList);
    }

}
