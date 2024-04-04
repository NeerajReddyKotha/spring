package com.sathya.app;

public class EmployeeBean {
private int empId;
private String empName;
private AddressBean addr;
public EmployeeBean() {
	super();
}
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
public AddressBean getAddr() {
	return addr;
}
public void setAddr(AddressBean addr) {
	this.addr = addr;
}
public void printdetails() {
	System.out.println(empId);
	System.out.println(empName);
	System.out.println(addr);
}
}
