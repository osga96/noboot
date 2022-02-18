package com.example.noboot;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.interfaces.Persona;
import com.example.demo.objects.Enano;

public class NobootApplication {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Persona se�or = context.getBean("se�or", Persona.class);
		Persona adulto = context.getBean("adulto", Persona.class);
		Persona enano = context.getBean("enano", Persona.class);
		Enano enano2 = context.getBean("enano", Enano.class);
		Enano enano3 = context.getBean("enano", Enano.class);

		System.out.println(se�or.getEdad());
		System.out.println(adulto.getEdad());
		System.out.println(enano.getEdad());
		System.out.println(enano2.getPropiedadComunATodosLosEnanos());
		System.out.println(enano3.getPropiedadComunATodosLosEnanos());

		System.out.println(se�or.getInforme());
		System.out.println(enano.getInforme());
		
		context.close();
		
	}

}
