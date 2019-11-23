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
        Course course = new Course("updatingWithoutCallingMerge ");
        entityManager.persist(course);
        course.setName("updatingWithoutCallingMerge --  updated");
    }

    /**
     * After every flush the data will be saved in database.
     */
    public void flushUsage() {

        Course course1 = new Course("flushUsage -- course1");
        entityManager.persist(course1);
        entityManager.flush();

        course1.setName("flushUsage -- course1 -- updated");
        entityManager.flush();

        Course course2 = new Course("flushUsage -- course2");
        entityManager.persist(course2);
        entityManager.flush();

        course2.setName("flushUsage -- course2 -- updated");
        entityManager.flush();
    }

    /**
     * After detach is called whtever changes are made to the course1 and course2 object, it will not be saved in database.
     */
    public void detachUsage() {

        Course course1 = new Course("detachUsage -- course1");
        entityManager.persist(course1);
        Course course2 = new Course("detachUsage -- course2");
        entityManager.persist(course2);

        entityManager.flush();

        entityManager.detach(course1);
        entityManager.detach(course2);

        course1.setName("detachUsage -- course1 -- updated ");
        entityManager.flush();
        course2.setName("detachUsage -- course2 -- updated");
        entityManager.flush();
    }

    /**
     * After clear is called whtever changes are made to the course1 and course2 object,all the objects, it will not be saved in database.
     */
    public void clearUsage() {

        Course course1 = new Course("clearUsage -- course1");
        entityManager.persist(course1);
        Course course2 = new Course("clearUsage -- course2");
        entityManager.persist(course2);

        entityManager.flush();

        entityManager.clear();

        course1.setName("clearUsage -- course1-- updated");
        entityManager.flush();
        course2.setName("clearUsage -- course2 -- updated");
        entityManager.flush();
    }
}
