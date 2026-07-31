package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class QuizController {

	@RequestMapping("/main")
	public String main() {
		return "quiz0/main";
	}
	
	@RequestMapping("/product")
	public String product() {
		return "quiz0/product";
	}
	
	@RequestMapping("/mypage")
	public String mypage() {
		return "quiz0/mypage";
	}
}
