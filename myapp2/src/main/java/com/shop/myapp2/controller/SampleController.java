package com.shop.myapp2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	@GetMapping("test3")
	public String getThy(Model model) {
		model.addAttribute("thy1","타임리프테스트1");
		return "test3";
	}
	@GetMapping("test4")
	public String getThy2(Model model) {
		SampleDTO sample = new SampleDTO("kkk", "1111");
		model.addAttribute("sample",sample);
		return "test4";
	}
	@GetMapping("test6")
	public String getThy6(Model model) {
		List<SampleDTO> sampleList = sampleService.getSample();
		model.addAttribute("sampleList",sampleList);
		return "test6";
	}
	
	@GetMapping("test7")
	public String getThy7(Model model) {
		List<SampleDTO> sampleList = sampleService.getSample();
		model.addAttribute("sampleList",sampleList);
		return "test7";
	}
	@GetMapping("test8")
	public String getThy8(Model model) {
		SampleDTO sample = new SampleDTO("kkk", "1111");
		List<String> genderList = new ArrayList<String>();
		genderList.add("M");
		genderList.add("F");
		model.addAttribute("gender","F");
		model.addAttribute("genderList",genderList);
		model.addAttribute("sample",sample);
		return "test8";
		
	}
    @GetMapping("test9")
    public String getThy9(Model model) {
    	return "test9";
    }
}
