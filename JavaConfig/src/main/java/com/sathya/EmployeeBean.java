package com.sathya;

public class EmployeeBean {
private int eid;
private String ename;
private String designation;
private AddressBean addr;
public EmployeeBean() {
	super();
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public AddressBean getAddr() {
	return addr;
}
public void setAddr(AddressBean addr) {
	this.addr = addr;
}
public void printDetails() 
{
	System.out.println(eid);
	System.out.println(ename);
	System.out.println(designation);
	System.out.println(addr);
}
}
