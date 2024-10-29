package org.example.domain.task;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TaskService {

    private final TaskRepository taskRepository;

    public Task createTask(String name) {
        return taskRepository.save(new Task(name));
    }

    public Task saveTask(Task task) {
        return taskRepository.save(task);
    }

    public Task getTaskByName(String name) {
        return taskRepository.findByName(name);
    }
}
