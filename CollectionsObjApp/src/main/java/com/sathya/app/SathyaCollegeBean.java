package com.sathya.app;

import java.security.KeyStore.Entry;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class SathyaCollegeBean {
 private List<String> studentNames;
 private Set<Integer> studentRollNo;
 private Map<String , Integer> branchDetails;
 private Properties branchInfo;
 
 public SathyaCollegeBean() {
	super();
}

public List<String> getStudentNames() {
	return studentNames;
}

public void setStudentNames(List<String> studentNames) {
	this.studentNames = studentNames;
}

public Set<Integer> getStudentRollNo() {
	return studentRollNo;
}

public void setStudentRollNo(Set<Integer> studentRollNo) {
	this.studentRollNo = studentRollNo;
}

public Map<String, Integer> getBranchDetails() {
	return branchDetails;
}

public void setBranchDetails(Map<String, Integer> branchDetails) {
	this.branchDetails = branchDetails;
}

public Properties getBranchInfo() {
	return branchInfo;
}

public void setBranchInfo(Properties branchInfo) {
	this.branchInfo = branchInfo;
}

void StudentDeatils() {
   for (String studentName : studentNames) {
	System.out.println(studentName);
}
   for (Integer studentrollno: studentRollNo) {
	System.out.println(studentrollno);
}
   for (Map.Entry<String,Integer> entry:branchDetails.entrySet()) {
	System.out.println(entry.getKey()+" "+entry.getValue());
}
   Set<String> keys=branchInfo.stringPropertyNames();
   for (String key : keys) {
	System.out.println(key+" "+branchInfo.getProperty(key));
}
   
 }
}
