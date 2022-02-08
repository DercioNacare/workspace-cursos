package com.dn.code.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dn.code.brewer.domain.model.Cerveja;

@Controller
@RequestMapping("/cervejas")
public class CervejaController 
{
	
	@GetMapping("/novo")
	public ModelAndView novo(Cerveja cerveja)
	{
		return new ModelAndView("cervejas/cadastro-cerveja");
	}
	
	@PostMapping("/novo")
	public ModelAndView cadastrar(Cerveja cerveja)
	{
		System.out.println(">>>> cadastrando " + cerveja.getSku());
	
		return new ModelAndView("cervejas/cadastro-cerveja");
	}
}
