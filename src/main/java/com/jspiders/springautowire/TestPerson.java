package com.jspiders.springautowire;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = null;

		context = new ClassPathXmlApplicationContext("com/jspiders/springautowire/springconfig.xml");

		Person person = (Person) context.getBean("person");
		System.out.println(person);

		if (context != null) {
			context.close();
		}
	}
}
/*
 * Person [name=King, email=king@jspiders.com, contact=7676866303,
 * address=Address [pincode=560004, state=karanataka, city=Banglore]]
 */
