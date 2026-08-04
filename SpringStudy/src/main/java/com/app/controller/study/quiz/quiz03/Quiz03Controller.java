package com.app.controller.study.quiz.quiz03;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.app.dto.study.quiz.DrinkItem;

@Controller
@RequestMapping("/quiz03")
public class Quiz03Controller {
	
	//localhost:8080/quiz03/request1-1?item=americano&type=coffee
	@GetMapping("/request1-1")
	public String request1_1(HttpServletRequest request) {
		System.out.println("/request1-1 요청");
		
		System.out.println(request.getParameter("item"));
		System.out.println(request.getParameter("type"));
		
		return "quiz/quiz03/viewData";
	}
	
	//localhost:8080/quiz03/request1-2?item=americano&type=coffee
	@GetMapping("/request1-2")
	public String request1_2(@RequestParam String item, @RequestParam String type) {
		System.out.println("/request1-2 요청");
		
		System.out.println(item);
		System.out.println(type);
		
		return "quiz/quiz03/viewData";
	}
	
	//localhost:8080/quiz03/request1-3?item=americano&type=coffee
	@GetMapping("/request1-3")
	public String request1_3(@RequestParam Map<String, String> paramMap) {
		System.out.println("/request1-3 요청");
		
		System.out.println(paramMap.get("item"));
		System.out.println(paramMap.get("type"));
		
		return "quiz/quiz03/viewData";
	}
	
	//localhost:8080/quiz03/request1-4?item=americano&type=coffee
	@GetMapping("/request1-4")
	public String request1_4(@ModelAttribute DrinkItem drinkItem) {
		System.out.println("/request1-4 요청");
		
		drinkItem.setName(drinkItem.getItem());
		
		System.out.println(drinkItem.getName());
		System.out.println(drinkItem.getType());
		
		return "quiz/quiz03/viewData";
	}
	
	
	//localhost:8080/quiz03/viewData1-1
	@GetMapping("/viewData1-1")
	public String viewData1_1(HttpServletRequest request) {
		
		request.setAttribute("name", "americano");
		request.setAttribute("type", "coffee");
		
		return "quiz/quiz03/viewData";
	}
	
	//localhost:8080/quiz03/viewData1-2
	@GetMapping("/viewData1-2")
	public String viewData1_2(Model model) {
		
		model.addAttribute("name", "americano");
		model.addAttribute("type", "coffee");
		
		return "quiz/quiz03/viewData";
	}
	
	//localhost:8080/quiz03/viewData1-3
	@GetMapping("/viewData1-3")
	public ModelAndView viewData1_3(ModelAndView mav) {
		
		mav.setViewName("/quiz/quiz03/viewData");
		mav.addObject("name", "americano");
		mav.addObject("type", "coffee");
		
		return mav;
	}
	
	//localhost:8080/quiz03/viewData1-4
	@GetMapping("/viewData1-4")
	public String viewData1_4(Model model) {
		
		DrinkItem drinkItem = new DrinkItem();
		
		drinkItem.setName("americano");
		drinkItem.setType("coffee");
		
		model.addAttribute("drinkItem", drinkItem);
		
		return "quiz/quiz03/viewData";
	}
}
