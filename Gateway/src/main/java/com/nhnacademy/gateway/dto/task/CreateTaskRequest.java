package com.nhnacademy.gateway.dto.task;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class CreateTaskRequest {

    private Long projectId;
    private Long milestoneId;
    private String title;
    private String content;
    private String registerId;
    private List<Long> tags;
}
