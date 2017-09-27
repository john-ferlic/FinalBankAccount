package com.BankAccount;

public class Applicant {
	
	private int applnumber;
	private String firstname;
	private String midname;
	private String lastname;
	private String addrline1;
	private String addrline2;
	private String city;
	private int zipcode;
	
	public int getApplnumber() {
		return applnumber;
	}
	public void setApplnumber(int applnumber) {
		this.applnumber = applnumber;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMidname() {
		return midname;
	}
	public void setMidname(String midname) {
		this.midname = midname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getAddrline1() {
		return addrline1;
	}
	public void setAddrline1(String addrline1) {
		this.addrline1 = addrline1;
	}
	public String getAddrline2() {
		return addrline2;
	}
	public void setAddrline2(String addrline2) {
		this.addrline2 = addrline2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	private String state;

}
