package com.example.boardmanager.service.impl;

import com.example.boardmanager.model.Task;
import com.example.boardmanager.repository.TaskRepository;
import com.example.boardmanager.service.TaskService;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {
    private final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task getById(Long id) {
        return taskRepository.getReferenceById(id);
    }
}
