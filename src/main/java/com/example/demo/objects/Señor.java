package com.example.demo.objects;

import com.example.demo.interfaces.CreacionInformes;
import com.example.demo.interfaces.Persona;

public class Señor implements Persona {

	private CreacionInformes informe;
	
	public Señor(CreacionInformes informe) {
		this.informe = informe;
	}
	
	@Override
	public String getEdad() {
		// TODO Auto-generated method stub
		return "edad de señor";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "es un señor mayor: " + informe.getInforme();
	}

}
