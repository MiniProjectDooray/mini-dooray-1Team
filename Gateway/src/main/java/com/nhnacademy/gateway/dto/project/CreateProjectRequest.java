package com.nhnacademy.gateway.dto.project;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CreateProjectRequest {

    private String projectAdmin;
    private String name;
    private String content;
}
