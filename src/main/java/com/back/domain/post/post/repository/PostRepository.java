package com.back.domain.post.post.repository;

import com.back.domain.post.post.entity.post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<post ,Integer> {

}
