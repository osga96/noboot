package com.example.demo.objects;

import com.example.demo.interfaces.CreacionInformes;
import com.example.demo.interfaces.Persona;

public class Adulto implements Persona {

	private CreacionInformes informe;

	@Override
	public String getEdad() {
		// TODO Auto-generated method stub
		return "edad de adulto";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "informe adulto" + informe.getInforme();
	}

}
