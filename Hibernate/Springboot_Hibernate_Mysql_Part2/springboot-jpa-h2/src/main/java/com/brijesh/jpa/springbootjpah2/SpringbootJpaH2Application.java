package com.brijesh.jpa.springbootjpah2;

import com.brijesh.jpa.springbootjpah2.repository.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
    }
}
