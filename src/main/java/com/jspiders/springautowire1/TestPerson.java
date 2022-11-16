package com.jspiders.springautowire1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = null;

		context = new ClassPathXmlApplicationContext("com/jspiders/springautowire1/springconfig.xml");

		Person person = (Person) context.getBean("person");
		System.out.println(person);

		if (context != null) {
			context.close();
		}
	}
}
/*
Person [name=Bob, email=bob@gmail.com, contact=7768964762, address=Address [pincode=560004, state=karanataka, city=Banglotre]]

*/