package br.com.atividade04.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.atividade04.repository.FuncionarioRepository;

@Controller
public class FuncionarioController {
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;
	@GetMapping("/funcionario/list")
	
	public String listFuncionarios(Model model) {
		
		return "/funcionario/list";
	}

}
