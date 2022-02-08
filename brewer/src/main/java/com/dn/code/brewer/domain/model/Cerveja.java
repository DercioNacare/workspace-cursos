package com.dn.code.brewer.domain.model;

import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cerveja 
{
	@NotBlank
	private String sku;
	private String nome;
}
