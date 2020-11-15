package com.nit.entity;

public class Student {
 private String sno;
 private String sname;
 private String address;
 
public Student(String sno, String sname, String address) {
	super();
	this.sno = sno;
	this.sname = sname;
	this.address = address;
}

public String getSno() {
	return sno;
}

public void setSno(String sno) {
	this.sno = sno;
}

public String getSname() {
	return sname;
}

public void setSname(String sname) {
	this.sname = sname;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}
 

}
