package com.shop.myapp2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shop.myapp2.dto.SampleDTO;
import com.shop.myapp2.repository.SampleMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SampleServiceImpl implements SampleService {
	private final SampleMapper sampleMapper;

	@Override
	public List<SampleDTO> getSample() {
		return sampleMapper.getSample();
	}
	
	

}
