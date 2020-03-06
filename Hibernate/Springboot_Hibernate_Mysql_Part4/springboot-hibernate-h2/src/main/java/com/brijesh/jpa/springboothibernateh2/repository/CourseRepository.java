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
        logger.info(" CourseRepository - findById method starts-> {} ");
        Course course = entityManager.find(Course.class, id);
        logger.info(" CourseRepository - findById method ends-> {} ");
        return course;
    }

    public void deleteById(Long id) {
        logger.info(" CourseRepository - deleteById method starts-> {} ");
        Course course = findById(id);
        entityManager.remove(course);
        logger.info(" CourseRepository - deleteById method ends-> {} ");
    }

    public Course save(Course course) {
        logger.info(" CourseRepository - save method starts-> {} ");
        if (course.getId() == null) {
            entityManager.persist(course);
        } else {
            entityManager.merge(course);
        }
        logger.info(" CourseRepository - save method ends-> {} ");
        return course;
    }

    /**
     * Entity Manager keeps track of the changes and transactional makes the whole method one transaction.
     * so even if we are not explicitly calling merge method the update made to the object is getting saved as part
     * of one transaction.
     */
    public void updatingWithoutCallingMerge() {
        logger.info(" CourseRepository - updatingWithoutCallingMerge method starts-> {} ");
        Course course = new Course("updatingWithoutCallingMerge ");
        entityManager.persist(course);
        course.setName("updatingWithoutCallingMerge --  updated");
        logger.info(" CourseRepository - updatingWithoutCallingMerge method ends-> {} ");
    }

    /**
     * After every flush the data will be saved in database.
     */
    public void flushUsage() {
        logger.info(" CourseRepository - flushUsage method starts-> {} ");
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
        logger.info(" CourseRepository - flushUsage method ends-> {} ");
    }

    /**
     * After detach is called whtever changes are made to the course1 and course2 object, it will not be saved in database.
     */
    public void detachUsage() {
        logger.info(" CourseRepository - detachUsage method starts-> {} ");
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
        logger.info(" CourseRepository - detachUsage method ends-> {} ");
    }

    /**
     * After clear is called whtever changes are made to the course1 and course2 object,all the objects, it will not be saved in database.
     */
    public void clearUsage() {
        logger.info(" CourseRepository - clearUsage method starts-> {} ");
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
        logger.info(" CourseRepository - clearUsage method ends-> {} ");
    }

    /**
     * After we call refresh for course1 all the updates made to the course1 will be lost.
     * And course1 object will have data from database , after refresh is called.
     */
    public void refreshUsage() {
        logger.info(" CourseRepository - refreshUsage method starts-> {} ");
        Course course1 = new Course("refreshUsage -- course1");
        entityManager.persist(course1);
        Course course2 = new Course("refreshUsage -- course2");
        entityManager.persist(course2);
        entityManager.flush();

        // course1 and course2 are saved till above.

        course1.setName("refreshUsage -- course1-- updated");
        course2.setName("refreshUsage -- course2 -- updated");

        // updates made to the course1 will be lost and course1 object will have data from database.
        entityManager.refresh(course1);
        logger.info("course1 after refresh -> {} ", course1);
        logger.info("course2 after refresh -> {} ", course2);
        entityManager.flush();
        logger.info(" CourseRepository - refreshUsage method ends-> {} ");
    }

    /**
     * Testing the nullability of the column. Column tag is marked as nullable=false.
     */
    public void checkNullability(){
        logger.info(" CourseRepository - checkNullability method starts-> {} ");
        Course course = new Course("Checking the nullability");
        course.setName(null);
        entityManager.persist(course);
        entityManager.flush();
        logger.info(" CourseRepository - checkNullability method ends -> {} ");
    }

    public void timeStampMethod(){
        logger.info(" CourseRepository - timeStampMethod method starts-> {} ");
        Course course1= new Course("Tommy");
        entityManager.persist(course1);

        Course course2 = findById(10001L);
        course2.setName("BrijeshTimestamp");
        logger.info(" CourseRepository - timeStampMethod method ends-> {} ");
    }
}
