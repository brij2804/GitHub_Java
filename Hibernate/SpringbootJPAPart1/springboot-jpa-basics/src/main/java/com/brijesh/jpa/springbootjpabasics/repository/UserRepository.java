package com.brijesh.jpa.springbootjpabasics.repository;

import com.brijesh.jpa.springbootjpabasics.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
