package com.brijesh.jpa.springboothibernateh2.repository;

import com.brijesh.jpa.springboothibernateh2.entity.Course;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Repository
@Transactional
public class CourseRepository {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    @PersistenceContext
    private EntityManager entityManager;

    public Course findById(Long id) {
        return entityManager.find(Course.class, id);
    }

    public void deleteById(Long id) {
        Course course = findById(id);
        entityManager.remove(course);
    }

    public Course save(Course course) {
        if (course.getId() == null) {
            entityManager.persist(course);
        } else {
            entityManager.merge(course);
        }
        return course;
    }

    /**
     * Entity Manager keeps track of the changes and transactional makes the whole method one transaction.
     * so even if we are not explicitly calling merge method the update made to the object is getting saved as part
     * of one transaction.
     */
    public void updatingWithoutCallingMerge() {
        logger.info("updatingWithoutCallingMerge - start");
        Course course = new Course("updatingWithoutCallingMerge entity manager");
        entityManager.persist(course);
        course.setName("Playing with entity manager updated");
    }

    /**
     * After every flush the data will be saved in database.
     */
    public void flushUsage() {

        Course course1 = new Course("Playing with entity manager");
        entityManager.persist(course1);
        entityManager.flush();

        course1.setName("Playing with entity manager updated");
        entityManager.flush();

        Course course2 = new Course("Playing with entity manager -> course2");
        entityManager.persist(course2);
        entityManager.flush();

        course2.setName("Playing with entity manager updated -> course2");
        entityManager.flush();
    }
}
