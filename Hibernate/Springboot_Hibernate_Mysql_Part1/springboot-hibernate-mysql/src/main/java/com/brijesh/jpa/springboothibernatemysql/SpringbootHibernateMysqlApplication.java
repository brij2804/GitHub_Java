package com.brijesh.jpa.springboothibernatemysql;

import com.brijesh.jpa.springboothibernatemysql.entity.Employee;
import com.brijesh.jpa.springboothibernatemysql.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootHibernateMysqlApplication implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(SpringbootHibernateMysqlApplication.class);

    @Autowired
    private EmployeeRepository repository;


    public static void main(String[] args) {
        SpringApplication.run(SpringbootHibernateMysqlApplication.class, args);
    }

    @Override
    public void run(String... args) {

        log.info("StartApplication...");

        repository.save(new Employee("Ranga"));
        repository.save(new Employee("Chanda"));
        repository.save(new Employee("Piku"));


        System.out.println("\nfindAll()");
        repository.findAll().forEach(x -> System.out.println(x));

        System.out.println("\nfindById(1L)");
        repository.findById(1).ifPresent(x -> System.out.println(x));

        System.out.println("\nfindByName('Node')");
        repository.findByName("Node").forEach(x -> System.out.println(x));

    }

}
