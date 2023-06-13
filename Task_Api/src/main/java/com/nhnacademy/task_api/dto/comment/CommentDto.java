package com.nhnacademy.task_api.dto.comment;

import com.nhnacademy.task_api.entity.Comment;
import java.time.LocalDateTime;
import lombok.Getter;

@Getter
public class CommentDto {
    private final Long id;
    private final String registerId;
    private final String content;
    private final LocalDateTime createdAt;
    public CommentDto(Comment comment) {
        this.id = comment.getId();
        this.registerId = comment.getRegisterId();
        this.content = comment.getContent();
        this.createdAt = comment.getCreatedAt();
    }
}
