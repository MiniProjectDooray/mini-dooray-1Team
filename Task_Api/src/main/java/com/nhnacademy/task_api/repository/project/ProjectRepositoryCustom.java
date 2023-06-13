package com.nhnacademy.task_api.repository.project;

import com.nhnacademy.task_api.dto.project.ProjectDto;
import com.nhnacademy.task_api.entity.Project;

import java.util.List;

public interface ProjectRepositoryCustom {
    List<ProjectDto> findProjectByUserId(String userId);
}
