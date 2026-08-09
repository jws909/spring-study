package com.app.controller.study.quiz.quiz05;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/quiz05")
public class Quiz05Controller {
	
	@GetMapping("/pathA")
	public String pathA(Model model) {
		
		model.addAttribute("prodName", "A");
		
		return "quiz/quiz05/common";
	}
	
	@GetMapping("/pathB")
	public String pathB(Model model) {
		
		model.addAttribute("prodName", "B");
		
		return "quiz/quiz05/common";
	}

	@GetMapping("/pathCommon/{pathName}")
	public String pathCommon(@PathVariable String pathName, Model model) {
		
		if(pathName.equals("A") || pathName.equals("B"))
			model.addAttribute("prodName", pathName);
		else
			return "quiz/quiz05/empty";
		
		return "quiz/quiz05/common";
	}
}
