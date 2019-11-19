package com.brijesh.jdbc.springbootjdbch2;

import com.brijesh.jdbc.springbootjdbch2.entity.Person;
import com.brijesh.jdbc.springbootjdbch2.jdbc.PersonJdbcDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class SpringbootJdbcH2Application implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PersonJdbcDao dao;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootJdbcH2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

		logger.info("All users -> {} ", dao.findAll());

		logger.info("All users using RowMapper-> {} ", dao.findAllRowMapper());


		logger.info("User id 10001 -> {}", dao.findById(10001));

		logger.info("List of users by location -> {}", dao.findByLocation("Boston"));

		logger.info("Deleting 10002 -> No of Rows deleted -> {}", dao.deleteById(10002));

		Person person = new Person(10010, "Ravi", "Bombay", new Date());
		logger.info("Inserting person {}", person.toString(), dao.insert(person));

		Person personUp = new Person(10010, "Jumbo", "Bombay", new Date());
		logger.info("Updating a person {}", personUp.toString(), dao.update(personUp));
    }
}
