package com.example.boardmanager.service.impl;

import com.example.boardmanager.model.Board;
import com.example.boardmanager.repository.BoardRepository;
import com.example.boardmanager.service.BoardService;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService {
    private final BoardRepository boardRepository;

    public BoardServiceImpl(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    @Override
    public Board getById(Long id) {
        return boardRepository.getReferenceById(id);
    }

    @Override
    public Board create(Board board) {
        return boardRepository.save(board);
    }
}
