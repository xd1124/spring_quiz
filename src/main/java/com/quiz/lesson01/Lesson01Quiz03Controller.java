package com.quiz.lesson01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Lesson01Quiz03Controller {
	
	@RequestMapping("/lesson01/quiz03/1")
	public String quiz03_1() {
		return "/lesson01/quiz03";
	}

}
