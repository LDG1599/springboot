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

            post post1 =new post();
            post1.setTitle("제목 1");

            postRepository.save(post1);

            post post2 =new post();
            post2.setTitle("제목 2");

            postRepository.save(post2);

            System.out.println("기본 데이터가 초기화되었습니다.");


        };
    }
}
