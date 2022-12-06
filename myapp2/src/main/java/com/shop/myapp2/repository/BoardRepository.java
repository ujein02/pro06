package com.shop.myapp2.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.shop.myapp2.dto.BoardDTO;

@Mapper
@Repository
public interface BoardRepository {
	List<BoardDTO> boardList();

}
