package com.back.global.initData;

import com.back.domain.post.post.entity.post;
import com.back.domain.post.post.service.postService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.Optional;

@Configuration
public class BaseINitData {
    @Autowired
    private postService postService;

    @Bean
    ApplicationRunner baseInitDataApplicationRunner(){

        return args -> {
           work1();
           work2();

        };
    }
    void work1() {
        if (postService.count()>0) return;

        post post1 = new post("제목 1", "내용 1");
        postService.save(post1);
        post post2 = postService.save(new post("제목 2","내용 2"));

        System.out.println(post1.getId());
        System.out.println(post2.getId());

        System.out.println("기본 데이터가 초기화되었습니다.");

    }
    void work2() {
        Optional<post> opPost1 = postService.findById(1);

        post post1 = opPost1.get();
        System.out.println("post1"+post1);
    }
}
