package com.example.noboot;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.interfaces.Persona;

public class NobootApplication {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Persona señor = context.getBean("señor", Persona.class);
		Persona adulto = context.getBean("adulto", Persona.class);
		Persona enano = context.getBean("enano", Persona.class);

		System.out.println(señor.getEdad());
		System.out.println(adulto.getEdad());
		System.out.println(enano.getEdad());

		System.out.println(señor.getInforme());
		System.out.println(enano.getInforme());
		
		context.close();
		
	}

}
