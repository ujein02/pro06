package com.shop.myapp2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shop.myapp2.dto.BoardDTO;
import com.shop.myapp2.repository.BoardRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BoardServiceImpl implements BoardService{
	
	private final BoardRepository boardRepository;

	@Override
	public List<BoardDTO> BoardList() throws Exception {
		return boardRepository.boardList();
	}
	
	

}
