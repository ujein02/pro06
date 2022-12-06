package com.shop.myapp2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shop.myapp2.service.MemberService;

@Controller
@RequestMapping(value = "/member/")
public class MemberController {
	
	@Autowired
	MemberService memberService;

}
