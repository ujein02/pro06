package com.shop.myapp2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.myapp2.dto.SampleDTO;
import com.shop.myapp2.service.SampleService;

@Controller
@RequestMapping(value = "/sample/")
public class SampleController {
	
	@Autowired
	SampleService sampleService;
	
	@GetMapping("test1")
	@ResponseBody
	public String test1() {
		return "Hello Spring Boot Test1";
	}
	
	@GetMapping("test2")
	@ResponseBody
	public List<SampleDTO> sampleTest(){
		return sampleService.getSample();
	}

}
