package com.nit.model;

public class User {
	
	private String uname;
	private String pword;
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPword() {
		return pword;
	}
	public void setPword(String pword) {
		this.pword = pword;
	}
	@Override
	public String toString() {
		return "User [uname=" + uname + ", pword=" + pword + "]";
	}
	
	

}
