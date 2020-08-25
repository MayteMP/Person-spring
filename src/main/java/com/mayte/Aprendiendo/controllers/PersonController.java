package com.mayte.Aprendiendo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mayte.Aprendiendo.interfaceService.IpersonaService;
import com.mayte.Aprendiendo.models.person;

@Controller
@RequestMapping
public class PersonController {
	@Autowired
	private IpersonaService service;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		List<person>personas = service.listar();
		model.addAttribute("personas", personas);
		return "index";
	}
}
