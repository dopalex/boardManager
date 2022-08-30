package com.example.boardmanager.controller;

import com.example.boardmanager.dto.request.BoardRequestDto;
import com.example.boardmanager.dto.response.BoardResponseDto;
import com.example.boardmanager.mapper.BoardMapper;
import com.example.boardmanager.model.Board;
import com.example.boardmanager.service.BoardService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("boards")
public class BoardController {
    private final BoardService boardService;
    private final BoardMapper boardMapper;

    public BoardController(BoardService boardService, BoardMapper boardMapper) {
        this.boardService = boardService;
        this.boardMapper = boardMapper;
    }

    @PostMapping
    public BoardResponseDto create(@RequestBody BoardRequestDto requestDto) {
        Board board = boardMapper.fromDto(requestDto);
        return boardMapper.toDto(boardService.create(board));
    }
}
