package com.example.springdoc.domain.post.post.dto;

import com.example.springdoc.domain.post.post.entity.Post;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PostDto {

    private long id;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;
    private String title;
    private long authorId;
    private String authorName;
    private boolean published;
    private boolean listed;

    public PostDto(Post post) {
        this.id = post.getId();
        this.createdDate = post.getCreatedDate();
        this.modifiedDate = post.getModifiedDate();
        this.title = post.getTitle();
        this.authorId = post.getAuthor().getId();
        this.authorName = post.getAuthor().getUsername();
        this.published = post.isPublished();
        this.listed = post.isListed();
    }
}
