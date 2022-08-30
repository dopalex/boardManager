package com.example.boardmanager.dto.request;

import lombok.Data;

import java.util.List;

@Data
public class BoardRequestDto {
    private String name;
    private String path;
    private List<ColumnRequestDto> listOfColumns;
}
