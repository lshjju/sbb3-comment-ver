package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


// @Controller - 이 클래스는 콘트롤러 역할임을 정의
// public - 
// @GetMapping - 클라이언트에서 해당 유알엘 요청이 오면 아래 메서드 실행
// @ResponseBody - 메서드의 출력 결과를 뷰에 그대로 출력
// public - 매핑유알엘과 메서드네임은 달라도 됨
// return - 리턴 값 뷰에 출력
@Controller
public class HelloController {
	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		return "Hello Spring Boot Board";
	}
}
