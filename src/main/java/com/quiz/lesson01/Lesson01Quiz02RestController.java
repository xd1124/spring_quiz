package com.quiz.lesson01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lesson01/quiz02")
public class Lesson01Quiz02RestController {
	
	@RequestMapping("/1")
	public List<Map<String, Object>> quiz02_1() {
		List<Map<String, Object>> list = new ArrayList<>();
		
		Map<String, Object> movie = new HashMap<>();
		
		movie.put("rate", 15);
		movie.put("director", "봉준호");
		movie.put("time", 131);
		movie.put("title", "기생충");
		list.add(movie);
		
		movie = new HashMap<>();
		movie.put("rate", 0);
		movie.put("director", "로베르토 베니니");
		movie.put("time", 116);
		movie.put("title", "인생은 아름다워");
		list.add(movie);
		
		movie = new HashMap<>();
		movie.put("rate", 12);
		movie.put("director", "크리스토퍼 놀란");
		movie.put("time", 147);
		movie.put("title", "인셉션");
		list.add(movie);
		
		movie = new HashMap<>();
		movie.put("rate", 19);
		movie.put("director", "윤종빈");
		movie.put("time", 133);
		movie.put("title", "범죄와의 전쟁 : 나쁜놈들 전성시대");
		list.add(movie);

		movie = new HashMap<>();
		movie.put("rate", 15);
		movie.put("director", "프란시스 로렌스");
		movie.put("time", 137);
		movie.put("title", "헝거게임");
		list.add(movie);
		
		return list;
	}
	
	@RequestMapping("/2")
	public List<Board> quiz02_2() {
		List<Board> result = new ArrayList<>();
		
		Board board = new Board();
		board.setTitle("안녕하세요 가입인사 드립니다.");
		board.setUser("hagulu");
		board.setContent("안녕하세요. 가입했어요. 앞으로 잘 부탁 드립니다. 활동 열심히 하겠습니다.");
		result.add(board);
		
		board = new Board();
		board.setTitle("헐 대박");
		board.setUser("bada");
		board.setContent("오늘 목요일이었어... 금요일인줄");
		result.add(board);
		
		board = new Board();
		board.setTitle("오늘 데이트 한 이야기 해드릴게요.");
		board.setUser("dulumary");
		board.setContent("...");
		result.add(board);
		
		return result;
		
		}
	
		@RequestMapping("/3")
		public ResponseEntity<Board> quiz02_3() {
			Board board = new Board();
			board.setTitle("안녕하세요 가입인사 드립니다.");
			board.setUser("hagulu");
			board.setContent("안녕하세요. 가입했어요. 앞으로 잘 부탁 드립니다. 활동 열심히 하겠습니다.");
			
			return new ResponseEntity<>(board, HttpStatus.INTERNAL_SERVER_ERROR);
			// 작업 확인
		}

}
