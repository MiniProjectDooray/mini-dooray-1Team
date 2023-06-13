package com.nhnacademy.task_api.entity;

import com.nhnacademy.task_api.dto.task.CreateTaskDto;
import com.nhnacademy.task_api.dto.task.ModifyTaskDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Primary;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Tasks")
@Getter
@NoArgsConstructor
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "project_id", nullable = false)
    private Project project;

    @OneToOne
    @JoinColumn(name = "milestone_id")
    private Milestone milestone;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    @Column(name = "register_id", nullable = false)
    private String registerId;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    private LocalDateTime deadline;

    public Task(Project project, Milestone milestone, CreateTaskDto taskDto) {
        this.project = project;
        this.milestone = milestone;
        this.title = taskDto.getTitle();
        this.content = taskDto.getContent();
        this.registerId = taskDto.getRegisterId();
        this.createdAt = LocalDateTime.now();
    }

    public void modifyTask(Milestone milestone, ModifyTaskDto modifyTask) {
        this.milestone = milestone;
        this.title = modifyTask.getTitle();
        this.content = modifyTask.getContent();
    }
}
