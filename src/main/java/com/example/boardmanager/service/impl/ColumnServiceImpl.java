package com.example.boardmanager.service.impl;

import com.example.boardmanager.model.Column;
import com.example.boardmanager.repository.ColumnRepository;
import com.example.boardmanager.service.ColumnService;
import org.springframework.stereotype.Service;

@Service
public class ColumnServiceImpl implements ColumnService {
    private final ColumnRepository columnRepository;

    public ColumnServiceImpl(ColumnRepository columnRepository) {
        this.columnRepository = columnRepository;
    }

    @Override
    public Column getById(Long id) {
        return columnRepository.getReferenceById(id);
    }

    @Override
    public Column create(Column column) {
        return columnRepository.save(column);
    }
}
