package com.springcore;

public class Emp {
	private int empId;
	private String empName;
	private  String desiganation;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDesiganation() {
		return desiganation;
	}
	public void setDesiganation(String desiganation) {
		this.desiganation = desiganation;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(int empId, String empName, String desiganation) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.desiganation = desiganation;
	}
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", desiganation=" + desiganation + "]";
	}
	
	
	

}
