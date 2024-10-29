package org.example.application;

import org.example.domain.project.Project;
import org.example.domain.project.ProjectRepository;
import org.example.domain.task.Comment;
import org.example.domain.task.Task;
import org.example.domain.task.TaskRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import org.springframework.data.relational.core.mapping.event.BeforeConvertCallback;

import java.util.UUID;

@Configuration
@EnableJdbcRepositories(basePackageClasses = {ProjectRepository.class, TaskRepository.class})
public class AppConfig {

    @Bean
    BeforeConvertCallback<Project> beforeConvertCallback() {
        return (project) -> {
            if (project.getId() == null) {
                project.setId(UUID.randomUUID());
            }
            return project;
        };
    }

    @Bean
    BeforeConvertCallback<Task> taskBeforeConvertCallback() {
        return (project) -> {
            if (project.getId() == null) {
                project.setId(UUID.randomUUID());
            }
            return project;
        };
    }
}
