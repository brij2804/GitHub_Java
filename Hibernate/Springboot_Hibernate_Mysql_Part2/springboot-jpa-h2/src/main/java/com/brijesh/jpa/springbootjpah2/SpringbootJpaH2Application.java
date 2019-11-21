package com.brijesh.jpa.springbootjpah2;

import com.brijesh.jpa.springbootjpah2.entity.Person;
import com.brijesh.jpa.springbootjpah2.repository.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class SpringbootJpaH2Application implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PersonRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootJpaH2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("Find id 10001 -> {} ", repository.findById(10001));

		Person person = new Person("Ravi", "Bombay", new Date());
		logger.info("Inserting person {}", person.toString(), repository.insert(person));

		Person personUp = new Person(10003, "Jumbo", "Bombay", new Date());
		logger.info("Updating a person {}", personUp.toString(), repository.update(personUp));

		repository.delete(10002);

        logger.info("All users -> {}", repository.findAll());
    }
}
