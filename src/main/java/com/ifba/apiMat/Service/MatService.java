package com.ifba.apiMat.Service;

import org.springframework.stereotype.Service;

import com.ifba.apiMat.Model.ResultadoModel;

@Service
public class MatService 
{
	public ResultadoModel geraResultados(int numero)
	{
		
		ResultadoModel resultado = new ResultadoModel();
		
		int nDivesores = contaDivesores(numero);
		
		resultado.setNumeroDivisores(nDivesores);
		
		
		resultado.setEhPrimo(ehPrimo(nDivesores));
		
		
		resultado.setEhPar(ehPar(numero));
		
		return resultado; 
	}
	
	int contaDivesores(int numero)
	{
		int i,divesores=0;
		
		for(i=1; i<=numero;i++)
		{
			if(numero%i==0)
			{
				divesores++;
			}
		}
		return divesores;
	}
	
	boolean ehPar(int numero) {
		if (numero % 2 == 0) {
			return true;
		}
		return false;
	}
	
	boolean ehPrimo(int divesores)
	{
		if(divesores==2)
		return true;
		
		return false;
	}
}
