package com.gdu.song;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
	
	@PostMapping("/")
	public String index() {
		return "index";
	}
	
}