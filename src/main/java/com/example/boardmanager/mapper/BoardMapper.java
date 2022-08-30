package com.example.boardmanager.mapper;

import com.example.boardmanager.dto.request.BoardRequestDto;
import com.example.boardmanager.dto.response.BoardResponseDto;
import com.example.boardmanager.model.Board;
import com.example.boardmanager.model.Column;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class BoardMapper {
    private final ColumnMapper columnMapper;

    public BoardMapper(ColumnMapper columnMapper) {
        this.columnMapper = columnMapper;
    }


    public Board fromDto(BoardRequestDto requestDto) {
        Board board = new Board();
        board.setName(requestDto.getName());
        board.setPath(requestDto.getPath());
        board.setListOfColumns(requestDto.getListOfColumns()
                .stream()
                .map(columnMapper::fromDto)
                .collect(Collectors.toList()));
        return board;
    }

    public BoardResponseDto toDto(Board board) {
        BoardResponseDto responseDto = new BoardResponseDto();
        responseDto.setId(board.getId());
        responseDto.setName(board.getName());
        responseDto.setPath(board.getPath());
        responseDto.setListOfColumns(board.getListOfColumns()
                .stream()
                .map(columnMapper::toDto)
                .collect(Collectors.toList()));
        return responseDto;
    }
}
