package com.shop.myapp2.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.shop.myapp2.dto.MemberDTO;

@Mapper
@Repository
public interface MemberRepository {
	List<MemberDTO> memberList() throws Exception;

}
