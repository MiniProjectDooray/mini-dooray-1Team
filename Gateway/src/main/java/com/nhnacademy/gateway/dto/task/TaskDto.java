package com.nhnacademy.gateway.dto.task;

import com.nhnacademy.gateway.dto.comment.CommentDto;
import com.nhnacademy.gateway.dto.milestone.MilestoneDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
public class TaskDto {

    private Long id;
    private String title;
    private String content;
    private String registerId;
    private MilestoneDto milestone;
    private List<TaskDto> tags;
    private List<CommentDto> comments;
}
