package com.back.domain.post.post.service;

import com.back.domain.post.post.entity.post;
import com.back.domain.post.post.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service

public class postService {
    @Autowired
    private PostRepository postRepository;

    public long count() {
        return postRepository.count();
    }

    public post save(post post) {
        return postRepository.save(post);
    }

    public Optional<post> findById(int id) {
        return postRepository.findById(id);
    }
}
