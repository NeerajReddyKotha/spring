package com.sathya;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {
private int eid;
private String ename;
public EmployeeBean() {
}
public int getEid() {
	return eid;
}
@Value("1010")
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
@Value("kishan")
public void setEname(String ename) {
	this.ename = ename;
}
public void details() {
	
	System.out.println("my id:"+eid);
	System.out.println("ny name:"+ename);
	
}
}
