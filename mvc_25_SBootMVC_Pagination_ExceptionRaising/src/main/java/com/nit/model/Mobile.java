package com.nit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Entity
@Table(name="MOBILE")
public class Mobile {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer sno;
	private String model;
	private String company;
	private Float price;
	
}
