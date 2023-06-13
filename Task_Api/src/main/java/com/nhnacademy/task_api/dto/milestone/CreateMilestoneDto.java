package com.nhnacademy.task_api.dto.milestone;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CreateMilestoneDto {
    private Long projectId;
    private String name;
    private LocalDateTime createdAt;
}
