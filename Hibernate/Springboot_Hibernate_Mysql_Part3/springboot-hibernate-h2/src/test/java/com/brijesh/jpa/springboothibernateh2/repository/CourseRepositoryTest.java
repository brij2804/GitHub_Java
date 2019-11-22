package com.brijesh.jpa.springboothibernateh2.repository;

import com.brijesh.jpa.springboothibernateh2.SpringbootHibernateH2Application;
import com.brijesh.jpa.springboothibernateh2.entity.Course;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootHibernateH2Application.class)
public class CourseRepositoryTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    CourseRepository repository;

    @Test
    public void findById() {
        Course course = repository.findById(10001L);
        assertEquals("Brijesh", course.getName());
    }

    @Test
    @DirtiesContext
    public void deleteById() {
        repository.deleteById(10002l);
        assertNull(repository.findById(10002l));
    }

    @Test
    @DirtiesContext
    public void save() {
        Course course = repository.findById(10001l);
        assertEquals("Brijesh", course.getName());
        course.setName("Chintu");

        repository.save(course);

        Course course1 = repository.findById(10001l);
        assertEquals("Chintu", course1.getName());
    }

}
