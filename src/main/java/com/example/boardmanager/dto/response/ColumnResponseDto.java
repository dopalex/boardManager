package com.example.boardmanager.dto.response;

import lombok.Data;

import java.util.List;

@Data
public class ColumnResponseDto {
    private Long id;
    private String name;
    private List<Long> listOfTasksId;
    private Long boardId;
}
