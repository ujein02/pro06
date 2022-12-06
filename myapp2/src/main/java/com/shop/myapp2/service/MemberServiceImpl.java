package com.shop.myapp2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shop.myapp2.dto.MemberDTO;
import com.shop.myapp2.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
	private final MemberRepository memberMapper;

	@Override
	public List<MemberDTO> memberList() throws Exception {
		return memberMapper.memberList();
	}
	
	

}
