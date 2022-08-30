package com.example.boardmanager.dto.response;

import lombok.Data;

import java.util.List;

@Data
public class BoardResponseDto {
    private Long id;
    private String name;
    private String path;
    private List<ColumnResponseDto> listOfColumns;

}
