package com.dn.code.brewer.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
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
	public ModelAndView cadastrar(@Valid Cerveja cerveja, BindingResult result)
	{
		if(result.hasErrors())
		{
			System.out.println(">>>> tem erro sim");
		}
		System.out.println(">>>> cadastrando " + cerveja.getSku());
	
		return new ModelAndView("cervejas/cadastro-cerveja");
	}
}
