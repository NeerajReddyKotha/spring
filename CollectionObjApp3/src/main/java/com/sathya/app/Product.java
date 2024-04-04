package com.sathya.app;

public class Product {
private int proId;
private String proName;
private Model mob;
public Product() {
	super();
}
public int getProId() {
	return proId;
}
public void setProId(int proId) {
	this.proId = proId;
}
public String getProName() {
	return proName;
}
public void setProName(String proName) {
	this.proName = proName;
}
public Model getMob() {
	return mob;
}
public void setMob(Model mob) {
	this.mob = mob;
}
public void productdetails() {
	System.out.println("proId:"+proId);
	System.out.println("proName:"+proName);
	System.out.println("mob:"+mob);
}

}
