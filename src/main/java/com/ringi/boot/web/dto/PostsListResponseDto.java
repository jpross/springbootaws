package com.ringi.boot.web.dto;

import com.ringi.boot.domain.posts.Posts;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PostsListResponseDto {
    private Long id;
    private String title;
    private String author;
    private LocalDateTime modifiedDate;

    public PostsListResponseDto(Posts entry) {
        this.id = entry.getId();
        this.title = entry.getTitle();
        this.author = entry.getAuthor();
        this.modifiedDate = entry.getModifiedDate();
    }
}
