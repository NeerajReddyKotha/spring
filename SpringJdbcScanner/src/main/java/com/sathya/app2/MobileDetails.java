package com.sathya.app2;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

public class MobileDetails {
private JdbcTemplate jt;
Scanner sc=new Scanner(System.in);
public MobileDetails() {
}
public JdbcTemplate getJt() {
	return jt;
}
public void setJt(JdbcTemplate jt) {
	this.jt = jt;
}
public void createtable() {
	jt.execute("create table scannerdata(modelnum number,modelnames varchar2(30))");
System.out.println("table created");
}
public void details() {
	while (true) {
	System.out.println("enter your id");
	int modelno=sc.nextInt();
	System.out.println("enter your modelname");
	String modelname=sc.next();
	int i=jt.update("insert into scannerdata values(+"+modelno+",'"+modelname+"')");
	System.out.println("data inserted");
	System.out.println("if u want to insert on more record");
	String option=sc.next();
	if (option.equals("no")) {
		System.out.println("thank u ");
		break;
	}
	}}
public void update()
{
System.out.println("if you want to update modelname yes/no");
String option=sc.next();
if (option.equalsIgnoreCase("yes")) {
	System.out.println("enter your id");
	int id=sc.nextInt();
	System.out.println("enter your modelname");
	String name=sc.next();
	jt.update("update scannerdata set modelnames=+'"+name+"' where modelnum=+"+id+"");
	System.out.println("data updated");
	
	
	
}

}
}