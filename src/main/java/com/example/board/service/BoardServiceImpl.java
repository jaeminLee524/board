package com.example.board.service;

import com.example.board.dto.BoardDto;
import com.example.board.mapper.BoardMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService{

    private final BoardMapper boardMapper;

    public BoardServiceImpl(BoardMapper boardMapper) {
        this.boardMapper = boardMapper;
    }

    @Override
    public List<BoardDto> selectBoardList() throws Exception {

        // TODO. 목록 조회 쿼리를 실행해서 실행 결과를 반환하는 기능을 구현

        return boardMapper.selectBoardList();
    }

    @Override
    public void insertBoard(BoardDto boardDto) throws Exception{
        boardMapper.insertBoard(boardDto);
    }


}
