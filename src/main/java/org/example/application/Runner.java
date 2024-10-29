package org.example.application;

import lombok.RequiredArgsConstructor;
import org.example.domain.project.ProjectService;
import org.example.domain.task.Task;
import org.example.domain.task.TaskService;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Runner {

    private final ProjectService projectService;
    private final TaskService taskService;

    @EventListener(ApplicationReadyEvent.class)
    void init() {
//        projectService.createProject("project 1");
//        var task = taskService.createTask("simple task");
//
//        task = taskService.getTaskByName("simple name");
//        task = new Task("simple task2");
//        task.addComment("kamil", "hello, world?");
//        taskService.saveTask(task);
        var task = taskService.getTaskByName("simple task2");
        System.out.println(task);

    }
}
