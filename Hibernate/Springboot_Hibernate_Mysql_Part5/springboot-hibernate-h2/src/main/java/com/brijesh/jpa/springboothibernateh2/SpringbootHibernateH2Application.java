package com.brijesh.jpa.springboothibernateh2;


import com.brijesh.jpa.springboothibernateh2.repository.CourseJPQLRepository;
import com.brijesh.jpa.springboothibernateh2.repository.CourseNativeRepository;
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

    @Autowired
    CourseNativeRepository courseNative;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootHibernateH2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        /*runRepositoryMethods();
        runJPQLMethods();
        runNativeMethods();*/
    }

    public void runRepositoryMethods() {
        logger.info("runRepositoryMethods {################################################################################} ");
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

        //courseRepository.checkNullability();

        courseRepository.timeStampMethod();
        logger.info("runRepositoryMethods {################################################################################} ");
    }

    public void runJPQLMethods() {
        logger.info("runJPQLMethods {$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$} ");
        courseJPQL.jpql_basic();
        courseJPQL.jpql_typedQuery();
        courseJPQL.jpql_where();
        courseJPQL.jpql_namedquery();
        courseJPQL.jpql_where_namedquery();
        logger.info("runJPQLMethods {$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$} ");
    }

    public void runNativeMethods() {
        logger.info("runNativeMethods {@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@} ");
        courseNative.native_queries_basic();
        courseNative.native_query_parameter();
        courseNative.native_query_named_parameter();
        courseNative.native_query_to_update();
        logger.info("runNativeMethods {@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@} ");
    }
}
