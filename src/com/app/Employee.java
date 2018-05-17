package com.app;



	public class Employee {
	 private int EmpId;
	 private String EmpName;
	 private double EmpSal;
	public double getEmpSal() {
		return EmpSal;
	}
	public void setEmpSal(double empSal) {
		EmpSal = empSal;
	}
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public Employee(int empId, String empName) {
		super();
		EmpId = empId;
		EmpName = empName;
	}
	@Override
	public String toString() {
		return "EmployeeSample [EmpId=" + EmpId + ", EmpName=" + EmpName
				+ ", EmpSal=" + EmpSal + "]";
	}
	 
		
		
	}



