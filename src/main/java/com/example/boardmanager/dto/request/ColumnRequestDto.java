package com.example.boardmanager.dto.request;

import lombok.Data;

import java.util.List;

@Data
public class ColumnRequestDto {
    private String name;
    private List<Long> listOfTasksId;
    private Long boardId;
}
