package com.address.book.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

	
	@GetMapping("/")
	public String showIndex() {
		return "index";
	}
	
	@GetMapping("/index")
	public String showIndex2() {
		return "index";
	}
	
	@GetMapping("/about")
	public String showabout() {
		return "about";
	}
	
	@GetMapping("/contact")
	public String showcontact() {
		return "contact";
	}
	
	@GetMapping("/portfolio")
	public String showportfolio() {
		return "portfolio";
	}
	
	@GetMapping("/terms")
	public String showterms() {
		return "terms";
	}
	
	@GetMapping("/navmenu")
	public String shownavmenu() {
		return "navmenu";
	}
	
	
	
}
