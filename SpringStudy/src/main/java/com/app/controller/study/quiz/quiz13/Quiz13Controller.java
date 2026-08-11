package com.app.controller.study.quiz.quiz13;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.util.MyCookieUtil;

@Controller
@RequestMapping("/quiz13")
public class Quiz13Controller {

	@GetMapping("/hideAd")
	public String hideAd(HttpServletRequest request) {
		
		String hide = MyCookieUtil.getCookieValue(request, "hide");
		
		if(hide != null) {
			request.setAttribute("hide", hide);
		}
		
		return "quiz/quiz13/hideAd";
	}
	
	@PostMapping("/hideAd")
	public String hideAdAction(HttpServletRequest request, HttpServletResponse response) {
		
		String hide = request.getParameter("hide");
		
		if(hide != null) {
			Cookie ck = MyCookieUtil.createCookie("hide", hide, 60*60*24);
			response.addCookie(ck);
		}
		
		return "redirect:/quiz13/hideAd";
	}
}
