package com.springboot.WebApplication.repository;

import com.springboot.WebApplication.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
