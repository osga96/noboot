package com.example.demo.objects;

import com.example.demo.interfaces.CreacionInformes;
import com.example.demo.interfaces.Persona;

public class Se�or implements Persona {

	private CreacionInformes informe;
	
	public Se�or(CreacionInformes informe) {
		this.informe = informe;
	}
	
	@Override
	public String getEdad() {
		// TODO Auto-generated method stub
		return "edad de se�or";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "es un se�or mayor: " + informe.getInforme();
	}

}
