package com.kishan;

public class StudentBean {
private int studno;
private String stdname;
private AdressBean addr;
public StudentBean() {
	super();
}
public StudentBean(int studno, String stdname, AdressBean addr) {
	super();
	this.studno = studno;
	this.stdname = stdname;
	this.addr = addr;
}
public void stddetails() {
	System.out.println(studno);
	System.out.println(stdname);
	System.out.println(addr);

}
}
