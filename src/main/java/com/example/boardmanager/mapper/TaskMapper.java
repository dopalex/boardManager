package com.example.boardmanager.mapper;

import com.example.boardmanager.dto.request.TaskRequestDto;
import com.example.boardmanager.dto.response.TaskResponseDto;
import com.example.boardmanager.model.Task;
import com.example.boardmanager.service.ColumnService;
import org.springframework.stereotype.Component;

@Component
public class TaskMapper {
    private final ColumnService columnService;

    public TaskMapper(ColumnService columnService) {
        this.columnService = columnService;
    }

    public Task fromDto(TaskRequestDto requestDto) {
        Task task = new Task();
        task.setTitle(requestDto.getTitle());
        task.setDescription(requestDto.getDescription());
        task.setColumn(columnService.getById(requestDto.getColumnId()));
        return task;
    }

    public TaskResponseDto toDto(Task task) {
        TaskResponseDto responseDto = new TaskResponseDto();
        responseDto.setId(task.getId());
        responseDto.setTitle(task.getTitle());
        responseDto.setColumnId(task.getId());
        return responseDto;
    }
}
