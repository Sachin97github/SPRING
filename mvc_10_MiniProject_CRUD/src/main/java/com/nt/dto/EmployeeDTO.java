package com.nt.dto;

public class EmployeeDTO {
	  
	private Integer serialNo;
	 private Integer eNo;
	 private String eName;
	 private String job;
	 private Integer deptNo;
	 private Float sal;
	 private Float netSalary;
	 private Float grossSalary;
	
	public Integer getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(Integer serialNo) {
		this.serialNo = serialNo;
	}
	public Integer geteNo() {
		return eNo;
	}
	public void seteNo(Integer eNo) {
		this.eNo = eNo;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Integer getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}
	
	public Float getSal() {
		return sal;
	}
	public void setSal(Float sal) {
		this.sal = sal;
	}
	public Float getNetSalary() {
		return netSalary;
	}
	public void setNetSalary(Float netSalary) {
		this.netSalary = netSalary;
	}
	public Float getGrossSalary() {
		return grossSalary;
	}
	public void setGrossSalary(Float grossSalary) {
		this.grossSalary = grossSalary;
	}
	@Override
	public String toString() {
		return "EmployeeDTO [serialNo=" + serialNo + ", eNo=" + eNo + ", eName=" + eName + ", job=" + job + ", deptNo="
				+ deptNo + ", sal=" + sal + ", netSalary=" + netSalary + "]";
	}
	 
	 

}
