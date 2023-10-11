package com.quiz.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Lesson01Quiz01Controller {
	
	// 1.
	@RequestMapping("/lesson01/quiz01/1") // http://localhost:8080/lesson01/quiz01/1
	@ResponseBody
	public String quiz01_1() {
		String test = "<h2>테스트 프로젝트 완성</h2>"
					+ "<h3>해당 프로젝트를 통해서 문제 풀이를 진행 합니다.</h3>";
		return test;
	}
	
	// 2.
	@RequestMapping("/lesson01/quiz01/2")
	@ResponseBody
	public Map<String, Integer> quiz01_2() {
		Map<String, Integer> map = new HashMap<>();
		map.put("국어", 80);
		map.put("수학", 90);
		map.put("영어", 85);
		return map;
	}
}
