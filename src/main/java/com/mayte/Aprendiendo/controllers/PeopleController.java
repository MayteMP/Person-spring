package com.mayte.Aprendiendo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PeopleController {

	@GetMapping({"/", "/person"})
	public String greet_person() {
		return "index_people";
	}
	
	@GetMapping("/person/{name}")
	public String greet_person(@PathVariable("name") String name) {
		ModelMap model = new ModelMap();
		model.addAttribute("name", name);
		
		return "index_people";
	}
}
