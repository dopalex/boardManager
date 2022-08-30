package com.example.boardmanager.dto.request;

import lombok.Data;

@Data
public class TaskRequestDto {
    private String title;
    private String description;
    private Long columnId;
}
