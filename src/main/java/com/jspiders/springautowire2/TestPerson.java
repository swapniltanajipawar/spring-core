package com.jspiders.springautowire2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = null;

		context = new ClassPathXmlApplicationContext("com/jspiders/springautowire2/springconfig.xml");

		Person1 person1 = (Person1) context.getBean("person1");
		System.out.println(person1);

		if (context != null) {
			context.close();
		}
	}
}
/*
Person [name=Bob, email=bob@gmail.com, contact=7768964762, address=Address [pincode=560004, state=karanataka, city=Banglotre]]
*/