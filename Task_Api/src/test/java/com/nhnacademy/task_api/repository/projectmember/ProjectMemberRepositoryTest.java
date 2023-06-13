package com.nhnacademy.task_api.repository.projectmember;

import com.nhnacademy.task_api.entity.Project;
import com.nhnacademy.task_api.entity.ProjectMember;
import com.nhnacademy.task_api.entity.ProjectStatus;
import com.nhnacademy.task_api.repository.project.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.util.ReflectionTestUtils;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@DataJpaTest
class ProjectMemberRepositoryTest {
    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private ProjectMemberRepository projectMemberRepository;
    @Test
    void existsById_memberId() {
        Project project = new Project();


        ReflectionTestUtils.setField(project, "id", 1L);
        ReflectionTestUtils.setField(project, "name", "name");
        ReflectionTestUtils.setField(project, "projectAdmin", "admin");
        ReflectionTestUtils.setField(project, "content", "content");
        ReflectionTestUtils.setField(project, "status", ProjectStatus.ACTIVE);
        ReflectionTestUtils.setField(project, "startDate", LocalDateTime.now());
        projectRepository.save(project);

        ProjectMember projectMember = new ProjectMember(project, 1L, "12345");
        projectMemberRepository.save(projectMember);

        boolean actual = projectMemberRepository.existsById_memberId(1L);

        assertThat(actual).isTrue();

    }
}