package com.quiz.lesson01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Lesson01Quiz03Controller {
	// quiz 변경
	@RequestMapping("/lesson01/quiz03/1")
	public String quiz03_1() {
		// @ResponseBody 어노테이션이 없을 때 String을 리턴하면
		// ViewResolver에 의해 리턴 String 경로의 jsp view 화면을 찾고 태그가 ResponseBody에 담긴다.
		return "/lesson01/quiz03";
	}

}
