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
public class CourseNativeRepositoryTest {


        private Logger logger = LoggerFactory.getLogger(this.getClass());

        @Autowired
        CourseNativeRepository courseNativeRepository;

        @Test
        public void native_queries_basic() {
            courseNativeRepository.native_queries_basic();
        }

        /*@Test
        public void jpql_typedQuery() {
            courseJPQL.jpql_typedQuery();
        }

        @Test
        public void jpql_namedquery() {
            courseJPQL.jpql_namedquery();
        }

        @Test
        public void jpql_where_namedquery() {
            courseJPQL.jpql_where_namedquery();*/

}
