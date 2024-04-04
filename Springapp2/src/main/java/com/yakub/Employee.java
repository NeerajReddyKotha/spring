package com.yakub;

public class Employee {
 private int empid;
 private String  empname;
 private double salary;
 private String designation;
public Employee() {
	super();
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
 public void printdetails()
 {
	 System.out.println(empid);
	 System.out.println(empname);
	 System.out.println(salary);
	 System.out.println(designation);
 }
}
