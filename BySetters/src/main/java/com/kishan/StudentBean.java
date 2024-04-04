package com.kishan;

public class StudentBean {
private int stdno;
private String stdname;
private AddressBean addr;
public StudentBean() {
	super();
}
public int getStdno() {
	return stdno;
}
public void setStdno(int stdno) {
	this.stdno = stdno;
}
public String getStdname() {
	return stdname;
}
public void setStdname(String stdname) {
	this.stdname = stdname;
}
public AddressBean getAddr() {
	return addr;
}
public void setAddr(AddressBean addr) {
	this.addr = addr;
}

public void studetails()
{
System.out.println(stdno);
System.out.println(stdname);
System.out.println(addr);
}
}
