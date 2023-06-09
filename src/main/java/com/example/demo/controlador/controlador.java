package com.example.demo.controlador;

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

import com.example.demo.interfacesSer.icelularesser;
import com.example.demo.modelo.celular;
@Controller
@RequestMapping


public class controlador {
	@Autowired
	private icelularesser service;

	@GetMapping("/listar")
	public String listar (Model model) {
		List<celular>celulares=service.listar();
		model.addAttribute("celulares", celulares);
		
		
		return "index";
	}
	
	@GetMapping("/new")
	public String agregar(Model model) {
		model.addAttribute("celular", new celular());
		return "formulario";
		
		
		
	}
	@PostMapping("/save")
	public String save(@Validated celular c, Model model ) {
		
		service.save(c);
		return "redirect:/listar";
	}
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable int id, Model model) {
		
		Optional<celular>celular=service.listarId(id);
		model.addAttribute("celular", celular);
		return "formulario";
		
		
	}
	
	@GetMapping("/eliminar/{id}")
	public String delete(Model model, @PathVariable int id) {
		
		service.delete(id);
		return"redirect:/listar";
	}
}
