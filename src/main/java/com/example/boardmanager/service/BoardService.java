package com.example.boardmanager.service;

import com.example.boardmanager.model.Board;

public interface BoardService {
    Board getById(Long id);

    Board create(Board board);
}
