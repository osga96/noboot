package com.example.demo.objects;

import com.example.demo.interfaces.CreacionInformes;
import com.example.demo.interfaces.Persona;

public class Enano implements Persona {
	
	private CreacionInformes informe;
	
	private String propiedadComunATodosLosEnanos;

	public void setInforme(CreacionInformes informe) {
		this.informe = informe;
	}

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

	public String getPropiedadComunATodosLosEnanos() {
		return propiedadComunATodosLosEnanos;
	}

	public void setPropiedadComunATodosLosEnanos(String propiedadComunATodosLosEnanos) {
		this.propiedadComunATodosLosEnanos = propiedadComunATodosLosEnanos;
	}

}
