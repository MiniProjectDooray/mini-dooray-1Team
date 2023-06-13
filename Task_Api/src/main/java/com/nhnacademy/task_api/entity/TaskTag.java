package com.nhnacademy.task_api.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Task_tag")
@Getter
@NoArgsConstructor
public class TaskTag {

    @EmbeddedId
    private Pk id;

    @MapsId("taskId")
    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "task_id")
    private Task task;

    @MapsId("tagId")
    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "tag_id")
    private Tag tag;

    @Getter
    @Embeddable
    @EqualsAndHashCode
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Pk implements Serializable{

        @Column(name = "task_id")
        private Long taskId;

        @Column(name = "tag_id")
        private Long tagId;
    }

    public TaskTag(Task task, Tag tag) {
        this.id = new Pk(task.getId(), tag.getId());
        this.task = task;
        this.tag = tag;
    }
}
