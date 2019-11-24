package com.brijesh.jpa.springboothibernateh2;


import com.brijesh.jpa.springboothibernateh2.repository.CourseJPQLRepository;
import com.brijesh.jpa.springboothibernateh2.repository.CourseRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootHibernateH2Application implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CourseJPQLRepository courseJPQL;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootHibernateH2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        runRepositoryMethods();
        runJPQLMethods();
    }

    public void runRepositoryMethods() {
        //Course course = courseRepository.findById(10001L);
        //logger.info("Find by Id 10001-> {} ", course);

        //courseRepository.deleteById(10001l);

        //Course course1 = new Course("Tom");
        // courseRepository.save(course1);
        //logger.info("Save : create new course-> {} ", course1);

        // Course course2 = courseRepository.findById(10004L);
        //  course2.setName("Montu");
        // courseRepository.save(course2);
        //  logger.info("Save : update course-> {} ", course2);

        courseRepository.updatingWithoutCallingMerge();

        courseRepository.flushUsage();

        courseRepository.detachUsage();

        courseRepository.clearUsage();

        courseRepository.refreshUsage();
    }

    public void runJPQLMethods() {
        courseJPQL.jpql_basic();
        courseJPQL.jpql_typedQuery();
        courseJPQL.jpql_where();
    }
}
