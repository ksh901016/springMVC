package kr.co.softcampus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class TestController {
	
	@RequestMapping(value = "/test")
	public String mapping() {
		System.out.println("hh");
		return null;
	}
}
