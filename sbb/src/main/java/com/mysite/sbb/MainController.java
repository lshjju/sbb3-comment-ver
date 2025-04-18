package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

// @GetMapping - 유알엘 콜
// @ResponseBody - 리턴이 뷰
// public - 
// return - 리스판스바디니까 리턴 뷰에서 출력	
	@GetMapping("/sbb")
	@ResponseBody
	public String index() {
		return "안녕하세요 sbb에 오신것을 환영합니다.";
	}

// @GetMapping - http://localhost:8080/ 콜
// public - 
// return - question/list 뷰 리다이렉트 - 이 유알엘을 메인페이지로 세팅
	@GetMapping("/")
	public String root() {
		return "redirect:/question/list";
	}
}
