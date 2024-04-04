package com.kishan;

public class AdressBean {
private int hno;
private String city;
private String state;
public AdressBean() {
	super();
}
public AdressBean(int hno, String city, String state) {
	super();
	this.hno = hno;
	this.city = city;
	this.state = state;
}
@Override
public String toString() {
	return "AdressBean [hno=" + hno + ", city=" + city + ", state=" + state + "]";
}

}
