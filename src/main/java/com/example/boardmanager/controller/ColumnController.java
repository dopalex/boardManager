package com.example.boardmanager.controller;

import com.example.boardmanager.dto.request.ColumnRequestDto;
import com.example.boardmanager.dto.response.ColumnResponseDto;
import com.example.boardmanager.mapper.ColumnMapper;
import com.example.boardmanager.model.Column;
import com.example.boardmanager.service.ColumnService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("columns")
public class ColumnController {
    private final ColumnService columnService;
    private final ColumnMapper columnMapper;

    public ColumnController(ColumnService columnService, ColumnMapper columnMapper) {
        this.columnService = columnService;
        this.columnMapper = columnMapper;
    }

    @PostMapping
    public ColumnResponseDto create(@RequestBody ColumnRequestDto requestDto) {
        Column column = columnMapper.fromDto(requestDto);
        return columnMapper.toDto(columnService.create(column));
    }
}
