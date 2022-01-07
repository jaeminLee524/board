package com.example.board.controller;

import com.example.board.dto.BoardDto;
import com.example.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    // ModelAndView -> Model로 수정
    @GetMapping("/board/openBoardList")
    public String openBoardList(Model model) throws Exception {

        List<BoardDto> boardDtoList = boardService.selectBoardList();

        model.addAttribute("list", boardDtoList);

        return "board/boardList";
    }

    //페이지 요청
    @GetMapping("/board/openBoardWrite")
    public String openBoardWrite(Model model) throws Exception{
        return "board/boardWrite";
    }

    // 저장
    @PostMapping("/board/insertBoard")
    public String insertBoard(BoardDto boardDto) throws Exception{

        boardService.insertBoard(boardDto);

        return "redirect:/board/openBoardList";
    }

}
