package com.nhnacademy.task_api.dto.milestone;

import com.nhnacademy.task_api.entity.Milestone;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
public class MilestoneDto {
    private final Long id;
    private final Long projectId;
    private final String name;
    private final LocalDateTime createdAt;

    public MilestoneDto(Milestone milestone) {
        this.id = milestone.getId();
        this.projectId = milestone.getProject().getId();
        this.name = milestone.getName();
        this.createdAt = milestone.getCreatedAt();
    }

}
