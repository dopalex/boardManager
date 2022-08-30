package com.example.boardmanager.mapper;

import com.example.boardmanager.dto.request.ColumnRequestDto;
import com.example.boardmanager.dto.response.ColumnResponseDto;
import com.example.boardmanager.model.Column;
import com.example.boardmanager.model.Task;
import com.example.boardmanager.service.BoardService;
import com.example.boardmanager.service.TaskService;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class ColumnMapper {
    private final TaskService taskService;
    private final BoardService boardService;

    public ColumnMapper(TaskService taskService, BoardService boardService) {
        this.taskService = taskService;
        this.boardService = boardService;
    }

    public Column fromDto(ColumnRequestDto requestDto) {
        Column column = new Column();
        column.setName(requestDto.getName());
        column.setListOfTasks(requestDto.getListOfTasksId()
                .stream()
                .map(taskService::getById)
                .collect(Collectors.toList()));
        column.setBoard(boardService.getById(requestDto.getBoardId()));
        return column;
    }

    public ColumnResponseDto toDto(Column column) {
        ColumnResponseDto responseDto = new ColumnResponseDto();
        responseDto.setId(column.getId());
        responseDto.setName(column.getName());
        responseDto.setListOfTasksId(column.getListOfTasks()
                .stream()
                .map(Task::getId)
                .collect(Collectors.toList()));
        responseDto.setBoardId(column.getBoard().getId());
        return responseDto;
    }
}
