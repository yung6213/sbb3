package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		return "Hello Spring Boot Board!!!!!!!!";
	}

	@GetMapping("/hellohtml")
	@ResponseBody
	public String hellohtml(){
		return "<html><body><h1 style=\"color:blue;\">안녕하세요</h1><body></html>";
	}
}

