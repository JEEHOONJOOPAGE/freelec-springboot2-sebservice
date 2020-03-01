package com.jjh.book.springboot.web.dto;

import com.jjh.book.springboot.domain.posts.Posts;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PostsListResponseDto {

    private Long id;
    private String title;
    private String author;
    private LocalDateTime updatedAt;

    public PostsListResponseDto(Posts posts){
        this.id = posts.getId();
        this.title = posts.getTitle();
        this.author = posts.getTitle();
        this.updatedAt = posts.getUpdatedAt();

    }
}
