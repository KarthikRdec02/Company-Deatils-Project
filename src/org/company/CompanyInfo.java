package org.company;

public class CompanyInfo {
	private void companyName() {
		// TODO Auto-generated method stub
System.out.println("NAME : ABC pvt ltd");
	}
	private void companyId() {
		// TODO Auto-generated method stub
System.out.println("ID : 123456789");
	}
	private void companyAddress() {
		// TODO Auto-generated method stub
System.out.println("ADDRESS : Tambaram, Chennai");
	}
	private void companyOwner() {
System.out.println("karthik R");
	}
	public static void main(String[] args) {
		CompanyInfo a=new CompanyInfo();
		a.companyName();
		a.companyId();
		a.companyAddress();  
		a.companyOwner();
	}
}
