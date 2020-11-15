package model;

public class Employee {
  private Integer eno;
  private String ename;
  private Integer sal;
  private Integer deptno;
  private String scriptStatus="disabled";
    
public String getScriptStatus() {
	return scriptStatus;
}
public void setScriptStatus(String scriptStatus) {
	this.scriptStatus = scriptStatus;
}
public Integer getEno() {
	return eno;
}
public void setEno(Integer eno) {
	this.eno = eno;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public Integer getSal() {
	return sal;
}
public void setSal(Integer sal) {
	this.sal = sal;
}
public Integer getDeptno() {
	return deptno;
}
public void setDeptno(Integer deptno) {
	this.deptno = deptno;
}
@Override
public String toString() {
	return "Employee [eno=" + eno + ", ename=" + ename + ", sal=" + sal + ", deptno=" + deptno + "]";
}
	
}
