package com.back.domain.post.post.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.NoArgsConstructor;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor

public class post {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private int id;
    private String title;
    @Column(columnDefinition = "TEXT")
    private String content;

    public post(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
