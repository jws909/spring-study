package com.app.controller.study.quiz.quiz14;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/quiz14")
public class Quiz14Controller {

	//의존성 주입
	@Autowired
	CupBean cupBean;
	
	@Autowired
	PlateBean plateBean;
	
	@GetMapping("/fullOrder")
	public String fullOrder() {
		
		System.out.println("/quiz14/fullOrder 접속");
		System.out.println(cupBean);
		System.out.println(plateBean);
		
		return "quiz/quiz14/coffeeList";
	}
	
	@GetMapping("/orderCoffee")
	public String orderCoffee() {
		
		System.out.println("/quiz14/orderCoffee 접속");
		System.out.println(cupBean);
		
		return "quiz/quiz14/coffeeList";
	}
	
	@GetMapping("/orderDessert")
	public String orderDessert() {
		
		System.out.println("/quiz14/orderDessert 접속");
		System.out.println(plateBean);
		
		return "quiz/quiz14/coffeeList";
	}
}
