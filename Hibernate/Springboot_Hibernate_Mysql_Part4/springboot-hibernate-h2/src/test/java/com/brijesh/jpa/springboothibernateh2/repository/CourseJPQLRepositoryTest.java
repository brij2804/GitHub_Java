package com.brijesh.jpa.springboothibernateh2.repository;

import com.brijesh.jpa.springboothibernateh2.SpringbootHibernateH2Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootHibernateH2Application.class)
public class CourseJPQLRepositoryTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    CourseJPQLRepository courseJPQL;

    @Test
    public void jpql_basic() {
        courseJPQL.jpql_basic();
    }

    @Test
    public void jpql_typedQuery() {
        courseJPQL.jpql_typedQuery();
    }
}
