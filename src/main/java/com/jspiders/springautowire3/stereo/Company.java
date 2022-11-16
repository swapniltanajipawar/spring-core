package com.jspiders.springautowire3.stereo;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Company {

	@Value("lmn8055")//primitive type
	private String companyCode;

	@Value("Microsoft")//primitive type
	private String companyName;

	@Value("100")//primitive type
	private int numberOfEmployee;

	@Value("#{names}")//
	private List<String> departmentNames;
	
	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getNumberOfEmployee() {
		return numberOfEmployee;
	}

	public void setNumberOfEmployee(int numberOfEmployee) {
		this.numberOfEmployee = numberOfEmployee;
	}

	@Override
	public String toString() {
		return "Company [companyCode=" + companyCode + ", companyName=" + companyName + ", numberOfEmployee="
				+ numberOfEmployee + "]";
	}

}
