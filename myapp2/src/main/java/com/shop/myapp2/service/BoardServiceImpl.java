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

	@Override
	public BoardDTO boardDetail(int bno) throws Exception {
		return boardRepository.boardDetail(bno);
	}

	@Override
	public void boardInsert(BoardDTO dto) throws Exception {
		boardRepository.boardInsert(dto);
		
	}
	
	
	

}
