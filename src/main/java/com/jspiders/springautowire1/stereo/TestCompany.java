package com.jspiders.springautowire1.stereo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCompany {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = null;

		context = new ClassPathXmlApplicationContext("com/jspiders/springautowire1/stereo/springconfig.xml");

		Company company = (Company) context.getBean("comp");
		System.out.println(company);

		if (context != null) {
			context.close();
		}
	}

}
/*
Company [companyCode=null, companyName=null, numberOfEmployee=0]
*/