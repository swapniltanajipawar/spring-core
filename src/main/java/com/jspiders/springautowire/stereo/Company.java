package com.jspiders.springautowire.stereo;
//
import org.springframework.stereotype.Component;

@Component
public class Company {
	private String companyCode;
	private String companyName;
	private int numberOfEmployee;

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
