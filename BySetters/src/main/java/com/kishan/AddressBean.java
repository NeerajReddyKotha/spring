package com.kishan;

public class AddressBean {
private int hno;
private String city;
private String state;
public AddressBean() {
	super();
}
public int getHno() {
	return hno;
}
public void setHno(int hno) {
	this.hno = hno;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
@Override
public String toString() {
	return "AddressBean [hno=" + hno + ", city=" + city + ", state=" + state + "]";
}

}
