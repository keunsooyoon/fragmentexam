package com.example.fragmentexam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FragController {

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	
	
	@GetMapping("/readlist")
	public String readlist() {
		return "readlist";
	}
	
	@GetMapping("/readdetail")
	public String readdetail() {
		return "readdetail";
	}
	
}
