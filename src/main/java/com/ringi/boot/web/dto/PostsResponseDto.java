package com.ringi.boot.web.dto;

import com.ringi.boot.domain.posts.Posts;
import lombok.Getter;

@Getter
public class PostsResponseDto {

    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseDto(Posts entry) {
        this.id = entry.getId();
        this.title = entry.getTitle();
        this.content = entry.getContent();
        this.author = entry.getAuthor();
    }

}
