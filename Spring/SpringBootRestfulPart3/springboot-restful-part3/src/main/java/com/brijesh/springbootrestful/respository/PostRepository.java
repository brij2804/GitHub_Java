package com.brijesh.springbootrestful.respository;

import com.brijesh.springbootrestful.beans.Post;
import com.brijesh.springbootrestful.beans.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {
}
