package com.kishan;

public class StudentMarks {
private int stdid;
private String firstName;
private String lastName;
private int sub1;
private int sub2;
private int sub3;

public StudentMarks() {
	super();
}

public StudentMarks(int stdid, String firstName, String lastName, int sub1, int sub2, int sub3) {
	super();
	this.stdid = stdid;
	this.firstName = firstName;
	this.lastName = lastName;
	this.sub1 = sub1;
	this.sub2 = sub2;
	this.sub3 = sub3;
}
public void details() {
	int Total=0;
	double Average=0;
	String Grade;
	Total=sub1+sub2+sub3;
	Average=(sub1+sub2+sub3)/3;
	if (Average>=70) {
	Grade="A";
	}
	else if (Average>=60) {
		Grade="B";
	}
	else if (Average>=50) {
		Grade="c";
	}
	else {
		Grade="Fail";
	}
	System.out.println("StudentId...."+stdid);
	System.out.println("studentName....."+firstName+lastName);
	System.out.println("sub1marks...."+sub1);
	System.out.println("sub2marks..."+sub2);
	System.out.println("sub3marks..."+sub3);
	System.out.println("Totalmarks...."+Total);
	System.out.println("Average...."+Average);
	System.out.println("Grade......"+Grade);
}



}
