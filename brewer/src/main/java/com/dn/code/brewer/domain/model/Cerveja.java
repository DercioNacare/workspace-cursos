package com.dn.code.brewer.domain.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cerveja 
{
	@NotBlank
	private String sku;
	
	@NotBlank
	private String nome;
	
	@NotBlank
	@Size(max = 50)
	private String descricao;
}
