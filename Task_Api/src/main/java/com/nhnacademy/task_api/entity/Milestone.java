package com.nhnacademy.task_api.entity;

import com.nhnacademy.task_api.dto.milestone.CreateMilestoneDto;
import com.nhnacademy.task_api.dto.milestone.ModifyMilestoneDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Milestones")
@Getter
@NoArgsConstructor
public class Milestone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;

    @Column(nullable = false)
    private String name;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    public Milestone(Project project, CreateMilestoneDto milestoneDto) {
        this.project = project;
        this.name = milestoneDto.getName();
        this.createdAt = LocalDateTime.now();
    }

    public void modifyMilestone(ModifyMilestoneDto modifyMilestone) {
        this.name = modifyMilestone.getName();
        this.createdAt = modifyMilestone.getCreatedAt();
    }

}
