package com.back.domain.post.post.service;

import com.back.domain.post.post.entity.post;
import com.back.domain.post.post.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class postService {

    private final PostRepository postRepository;

    public long count() {
        return postRepository.count();
    }

    public post save(post post) {
        return postRepository.save(post);
    }

    public Optional<post> findById(int id) {
        return postRepository.findById(id);
    }

    public void modify(post post, String title, String content) {
        post.setTitle(title);
        post.setContent(content);
        post.setModifyDate(LocalDateTime.now());

        postRepository.save(post);
    }
}
