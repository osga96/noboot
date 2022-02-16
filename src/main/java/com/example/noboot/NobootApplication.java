package com.example.noboot;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.interfaces.Persona;

public class NobootApplication {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Persona se�or = context.getBean("se�or", Persona.class);
		Persona adulto = context.getBean("adulto", Persona.class);
		Persona enano = context.getBean("enano", Persona.class);

		System.out.println(se�or.getEdad());
		System.out.println(adulto.getEdad());
		System.out.println(enano.getEdad());

		System.out.println(se�or.getInforme());
		System.out.println(enano.getInforme());
		
		context.close();
		
	}

}
