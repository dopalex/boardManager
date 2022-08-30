package com.example.boardmanager.service;

import com.example.boardmanager.model.Column;

public interface ColumnService {
    Column getById(Long id);

    Column create(Column column);
}
