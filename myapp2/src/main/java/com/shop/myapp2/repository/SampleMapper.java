package com.shop.myapp2.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.shop.myapp2.dto.SampleDTO;

@Mapper
@Repository
public interface SampleMapper {
	List<SampleDTO> getSample();
	SampleDTO sampleOne(String id);

}
