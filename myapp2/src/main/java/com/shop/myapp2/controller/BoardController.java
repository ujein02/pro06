package com.shop.myapp2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.myapp2.dto.BoardDTO;

import com.shop.myapp2.service.BoardService;

@Controller
@RequestMapping(value = "/board/")
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	@GetMapping("board1")
	@ResponseBody
	public List<BoardDTO> boardTest() throws Exception{
		return boardService.BoardList();
	}
	
	
}
