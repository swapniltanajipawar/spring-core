
package com.jspiders.springautowire3.stereo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCompany {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = null;

		context = new ClassPathXmlApplicationContext("com/jspiders/springautowire3/stereo/springconfig.xml");

		Company company = (Company) context.getBean("company");
		System.out.println(company);

		if (context != null) {
			context.close();
		}
	}

}
/*
 * Company [companyCode=lmn8055, companyName=Microsoft, numberOfEmployee=100]
 */