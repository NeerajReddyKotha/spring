package com.sathya;

public class AddressBean {
private int hno;
private String city;
private String state;
public AddressBean() {
	super();
}
public AddressBean(int hno, String city, String state) {
	super();
	this.hno = hno;
	this.city = city;
	this.state = state;
}
@Override
public String toString() {
	return "AddressBean [hno=" + hno + ", city=" + city + ", state=" + state + "]";
}

}