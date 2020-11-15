package com.nt.bo;

public class EmployeeBO {
	 private Integer eNo;
	 private String eName;
	 private String job;
	 private Integer deptNo;
	 private Float sal;
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
	@Override
	public String toString() {
		return "EmployeeBO [eNo=" + eNo + ", eName=" + eName + ", job=" + job + ", deptNo=" + deptNo + ", sal=" + sal
				+ "]";
	}
	 
	 
	 
	

}
