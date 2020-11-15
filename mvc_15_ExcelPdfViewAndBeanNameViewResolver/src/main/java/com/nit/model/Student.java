package com.nit.model;

import java.util.Date;

public class Student {
	
	private Integer sno;
	private String name;
	private String address;
	private Float per;
	private Date dob;
	public Integer getSno() {
		return sno;
	}
	public void setSno(Integer sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Float getPer() {
		return per;
	}
	public void setPer(Float per) {
		this.per = per;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + ", address=" + address + ", per=" + per + ", dob=" + dob
				+ "]";
	}
	
	
	

}
