package com.example.demo.objects;

import com.example.demo.interfaces.CreacionInformes;
import com.example.demo.interfaces.Persona;

public class Enano implements Persona {

	public void setInforme(CreacionInformes informe) {
		this.informe = informe;
	}

	private CreacionInformes informe;

	@Override
	public String getEdad() {
		// TODO Auto-generated method stub
		return "edad de pequeño";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "tienen informes los enanos: " + informe.getInforme();
	}
	
	

}
