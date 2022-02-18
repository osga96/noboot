package com.example.noboot;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.objects.Adulto;

public class UsoSingletonPrototypeApplication {

	public static void main(String[] args) {

		// Cargamos xml singleton
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContextSingletonPrototype.xml");
		
		//Pedimos beans
		Adulto adultoUno = context.getBean("adulto", Adulto.class);
		Adulto adultoDos = context.getBean("adulto", Adulto.class);

		// Si definimos scope="prototype", los objetos serán distintos
		System.out.println(adultoUno);
		System.out.println(adultoDos);
		
		System.out.println(adultoUno.equals(adultoDos));
		
	}

}
