package org.company;

public class CompanyInfo {

	private void companyName() {
		System.out.println("Company Name: Greens Technologies");

	}
	private void companyId() {
		System.out.println("Company ID: 54321");

	}
	private void companyAddress() {
		System.out.println("Company Address: OMR");

	}
	public static void main(String[] args) {
		CompanyInfo comInfo = new CompanyInfo();
		
		comInfo.companyName();
		comInfo.companyId();
		comInfo.companyAddress();
	}
}
