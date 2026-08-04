package com.app.controller.study.quiz.quiz02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/quiz02")
public class Quiz02Controller {

	@GetMapping("/req1")
	public String req1() {
		
		System.out.println("/quiz02/req1 GET 요청");
		return "quiz/quiz02/req";
	}
	
	@PostMapping("/req2")
	public String req2() {
		
		System.out.println("/quiz02/req2 POST 요청");
		return "quiz/quiz02/req";
	}
	
	@RequestMapping("/req3")
	public String req3(@RequestParam String data1, @RequestParam String data2) {
		
		System.out.println("/quiz02/req3 요청");
		System.out.println("data1 : " + data1);
		System.out.println("data2 : " + data2);
		
		return "quiz/quiz02/req";
	}
	
	
}
