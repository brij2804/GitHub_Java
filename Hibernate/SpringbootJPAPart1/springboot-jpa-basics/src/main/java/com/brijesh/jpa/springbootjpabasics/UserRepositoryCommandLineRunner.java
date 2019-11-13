package com.brijesh.jpa.springbootjpabasics;

import com.brijesh.jpa.springbootjpabasics.entity.User;
import com.brijesh.jpa.springbootjpabasics.repository.UserRepository;
import com.brijesh.jpa.springbootjpabasics.service.UserDAOService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Jill", "Admin");
        userRepository.save(user);
        log.info("New user is created by repository method : " + user);

        Optional<User> userWithOneId = userRepository.findById(1L);
        log.info("User retrieved by repository method : " + userWithOneId);

        List<User> userList = userRepository.findAll();
        log.info("All users by repository method : " + userList);
    }
}
