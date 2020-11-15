package com.nit.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Type;

@Entity
@Table(name="STD_TAB")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="STD_ID")
	private Integer id;
	
	@Type(type="string")
	@Column(name="STD_NAME",length=20)
	private String name;

	@Type(type="string")
	@Column(name="STD_FNAME",length=20)
	private String fatherName;

	@Type(type="string")
	@Column(name="STD_ADDRESS",length=20)
	private String address;
	
	@Type(type="long")
	@Column(name="STD_CONTACT")
	private Long contact;
	
	 @Temporal(TemporalType.DATE)
	@Column(name="STD_DOB")
	private Date dob;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="STD_DOJ")
	private Date  doj;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getContact() {
		return contact;
	}
	public void setContact(Long contact) {
		this.contact = contact;
	} 

	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", fatherName=" + fatherName + ", address=" + address
				+ ", contact=" + contact + ", dob=" + dob + ", doj=" + doj + "]";
	}

}
