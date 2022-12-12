package com.shop.myapp2.service;

import java.util.List;

import com.shop.myapp2.dto.BoardDTO;

public interface BoardService {
	List<BoardDTO>BoardList() throws Exception;
	BoardDTO boardDetail(int bno) throws Exception;
	void boardInsert(BoardDTO dto) throws Exception;

}
