package com.nhnacademy.task_api.entity;

import com.nhnacademy.task_api.dto.tag.ModifyTagDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Tags")
@Getter
@NoArgsConstructor
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;

    @Column(nullable = false)
    private String name;

    public Tag(Project project, String name) {
        this.project = project;
        this.name = name;
    }

    public void modifyTag(String name) {
        this.name = name;

    }
}
