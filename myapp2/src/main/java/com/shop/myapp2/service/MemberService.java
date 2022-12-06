package com.shop.myapp2.service;

import java.util.List;

import com.shop.myapp2.dto.MemberDTO;

public interface MemberService {
	List<MemberDTO> memberList() throws Exception;

}
