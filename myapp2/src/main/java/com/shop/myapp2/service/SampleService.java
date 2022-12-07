package com.shop.myapp2.service;

import java.util.List;

import com.shop.myapp2.dto.SampleDTO;

public interface SampleService {
	List<SampleDTO> getSample();
	SampleDTO sampleOne(String id);

}
