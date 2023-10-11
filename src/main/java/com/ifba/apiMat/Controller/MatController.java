package com.ifba.apiMat.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ifba.apiMat.Model.ResultadoModel;
import com.ifba.apiMat.Service.MatService;

@RestController
@RequestMapping(value = "/mat")
@CrossOrigin

public class MatController 
{
	@Autowired
	MatService matService;
	
	
	
	@GetMapping(value = "/{numero}")
	public ResultadoModel geraResultado(@PathVariable int numero)
	{
		return matService.geraResultados(numero);
	}
}
