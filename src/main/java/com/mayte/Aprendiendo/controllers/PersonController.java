package com.mayte.Aprendiendo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	@GetMapping("/new")
	public String agregar(Model model) {
		model.addAttribute("persona", new person());
		return "form";
	}
	@PostMapping("/save")
	public String Save(@Validated person p, Model model ) {
		service.save(p);
		return "redirect:/listar";
	}
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable Long id, Model model) {
		Optional<person> persona = service.listarId(id);
		model.addAttribute("persona", persona);
		return "form";
	}
	@GetMapping("/eliminar/{id}")
	public String delete(@PathVariable Long id, Model model) {
		service.delete(id);
		return "redirect:/listar";
	}
}
