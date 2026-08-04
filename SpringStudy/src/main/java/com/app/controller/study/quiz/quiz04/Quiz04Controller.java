package com.app.controller.study.quiz.quiz04;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.app.dto.study.quiz.quiz04.Gift;
import com.app.dto.study.quiz.quiz04.TransferItem;

@Controller
@RequestMapping("/quiz04")
public class Quiz04Controller {
	
		//localhost:8080/quiz04/request1-1?category=100&product=4000
		@GetMapping("/request1-1")
		public String request1_1(HttpServletRequest request) {
			System.out.println("/request1-1 요청");
			
			System.out.println(request.getParameter("category"));
			System.out.println(request.getParameter("product"));
			
			return "quiz/quiz04/req";
		}
		
		//localhost:8080/quiz04/request1-2?category=100&product=4000
		@GetMapping("/request1-2")
		public String request1_2(@RequestParam(required = false) String category, 
								@RequestParam(required = false) String product) {
			System.out.println("/request1-2 요청");
			
			System.out.println(category);
			System.out.println(product);
			
			return "quiz/quiz04/req";
		}
		
		//localhost:8080/quiz04/request1-3?category=100&product=4000
		@GetMapping("/request1-3")
		public String request1_3(@ModelAttribute Gift gift) {
			System.out.println("/request1-3 요청");
					
			System.out.println(gift.getCategory());
			System.out.println(gift.getProduct());
					
			return "quiz/quiz04/req";
		}
		
		//localhost:8080/quiz04/request1-4?category=100&product=4000
		@GetMapping("/request1-4")
		public String request1_4(@RequestParam Map<String, String> paramMap) {
			System.out.println("/request1-4 요청");
			
			System.out.println(paramMap.get("category"));
			System.out.println(paramMap.get("product"));
			
			return "quiz/quiz04/req";
		}
		
		
		//localhost:8080/quiz04/viewData1-1
		@GetMapping("/viewData1-1")
		public String viewData1_1(HttpServletRequest request) {
			
			request.setAttribute("response001", "반응001");
			request.setAttribute("response099", "반응099");
			
			return "quiz/quiz04/viewData";
		}
		
		//localhost:8080/quiz04/viewData1-2
		@GetMapping("/viewData1-2")
		public String viewData1_2(Model model) {
			
			model.addAttribute("response001", "반응001");
			model.addAttribute("response099", "반응099");
			
			return "quiz/quiz04/viewData";
		}
		
		//localhost:8080/quiz04/viewData1-3
		@GetMapping("/viewData1-3")
		public ModelAndView viewData1_3(ModelAndView mav) {
			
			mav.setViewName("/quiz/quiz04/viewData");
			mav.addObject("response001", "반응001");
			mav.addObject("response099", "반응099");
			
			return mav;
		}
		
		//localhost:8080/quiz04/viewData1-4
		@GetMapping("/viewData1-4")
		public String viewData1_4(@ModelAttribute TransferItem ti) {
			
			ti.setValue001("값001");
			ti.setValue099("값099");
			
			return "quiz/quiz04/viewData";
		}
}
