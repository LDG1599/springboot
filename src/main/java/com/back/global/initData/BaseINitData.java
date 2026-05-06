package com.back.global.initData;

import com.back.domain.post.post.entity.post;
import com.back.domain.post.post.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BaseINitData {
    @Autowired
    private PostRepository postRepository;

    @Bean
    ApplicationRunner baseInitDataApplicationRunner(){

        return args -> {
            if (postRepository.count()>0) return;

            post post1 = postRepository.save(new post("제목 1","내용 1"));
            post post2 = postRepository.save(new post("제목 2","내용 2"));
            System.out.println("기본 데이터가 초기화되었습니다.");


        };
    }
}
