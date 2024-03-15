package com.March14;

public class EmpData 
{
	private int EmpId;
	private String EmpName;
	private int Empage;
	private int Empsalary;
	
	@Override
	public String toString() {
		return "EmpData [EmpId=" + EmpId + ", EmpName=" + EmpName + ", EmpAge=" + EmpAge + ", EmpSalary=" + EmpSalary
				+ "]";
	}
	public EmpData(int empId, String empName, int empAge, int empSalary) {
		super();
		EmpId = empId;
		EmpName = empName;
		EmpAge = empAge;
		EmpSalary = empSalary;
	}
	public EmpData() {
		super();
		// TODO Auto-generated constructor stub
	}
	private int EmpAge;
	private int EmpSalary;
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
	public int getEmpAge() {
		return EmpAge;
	}
	public void setEmpAge(int empAge) {
		EmpAge = empAge;
	}
	public int getEmpSalary() {
		return EmpSalary;
	}
	public void setEmpSalary(int empSalary) {
		EmpSalary = empSalary;
	}
	
}
