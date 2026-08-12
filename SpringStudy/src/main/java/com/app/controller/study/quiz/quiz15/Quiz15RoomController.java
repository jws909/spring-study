package com.app.controller.study.quiz.quiz15;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Quiz15RoomController {
	
	@Autowired
	Quiz15RoomService quiz15RoomService;

	@GetMapping("/quiz15/registerRoom")
	public String registerRoom() {
		return "quiz/quiz15/registerRoom";
	}
	
	@PostMapping("/quiz15/registerRoom")
	public String registerRoomAction(@ModelAttribute Quiz15Room quiz15Room) {
		
		System.out.println("[Controller] registerRoom");
		
		int result = quiz15RoomService.saveRoom(quiz15Room);
		if(result > 0) {
			return "quiz/quiz15/registerRoom";
		} else {
			return "quiz/quiz15/registerRoom";
		}
	}
}
