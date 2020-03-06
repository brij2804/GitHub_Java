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

        @Test
        public void native_query_parameter() {
                courseNativeRepository.native_query_parameter();
        }

        @Test
        public void native_query_named_parameter() {
                courseNativeRepository.native_query_named_parameter();
        }

        @Test
        public void native_query_to_update() {
                courseNativeRepository.native_query_to_update();
        }




}
