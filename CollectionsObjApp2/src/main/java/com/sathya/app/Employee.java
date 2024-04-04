package com.sathya.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Employee {
private int empId;
private List<Integer> empProjects;
private Map<Integer, String> empMap;
public Employee() {
	super();
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public List<Integer> getEmpProjects() {
	return empProjects;
}
public void setEmpProjects(List<Integer> empProjects) {
	this.empProjects = empProjects;
}
public Map<Integer, String> getEmpMap() {
	return empMap;
}
public void setEmpMap(Map<Integer, String> empMap) {
	this.empMap = empMap;
}
public void empDetails() {
	System.out.println("Employee Id:"+empId);
	for (Integer empProject : empProjects) {
		Integer e=empProject;
	}
	List<Integer> e = empProjects;
	System.out.println("Emp projects:"+e);


		for(Map.Entry<Integer, String> entry:empMap.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	
}

}
