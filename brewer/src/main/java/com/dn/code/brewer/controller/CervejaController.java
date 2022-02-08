package com.dn.code.brewer.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	public ModelAndView cadastrar(@Valid Cerveja cerveja, BindingResult result, RedirectAttributes attributes)
	{
		if(result.hasErrors())
		{
			attributes.addFlashAttribute("mensagem", "Erro no formulario");
			System.out.println(">>>> tem erro sim");
			
			return new ModelAndView("redirect:/cervejas/novo");
		}
		System.out.println(">>>> cadastrando " + cerveja.getSku());
	
		return new ModelAndView("redirect:/cervejas/novo");
	}
}
