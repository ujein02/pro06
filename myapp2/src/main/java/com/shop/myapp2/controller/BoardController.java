package com.shop.myapp2.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shop.myapp2.dto.BoardDTO;
import com.shop.myapp2.service.BoardService;

@Controller
@RequestMapping(value = "/board/")
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	@GetMapping("list")
	public String boardList(Model model) throws Exception {
		List<BoardDTO> boardList = boardService.BoardList();
		model.addAttribute("boardList",boardList);
		return "fragments/content/board";
	}
	
	@GetMapping("detail")
	public String getBoardDetail(HttpServletRequest request, Model model) throws Exception {
		int bno = Integer.parseInt(request.getParameter("bno"));
		BoardDTO dto = boardService.boardDetail(bno);
		model.addAttribute("dto", dto);
		return "fragments/content/boardDetail";
	}
	
	@GetMapping("insert")
	public String insertForm(HttpServletRequest request, Model model) throws Exception {
		return "fragments/content/insert";
	}
	
	@PostMapping("insert")
	public String boardInsert(HttpServletRequest request, Model model) throws Exception {
		BoardDTO dto = new BoardDTO();
		dto.setTitle(request.getParameter("title"));
		dto.setContent(request.getParameter("content"));
		boardService.boardInsert(dto);
		
		return "fragments/content/board";
	}
}
