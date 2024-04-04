package com.sathya.app;

public class AddressBean {
private int hno;
private String Street;
private String city;
public AddressBean() {
	super();
}
public int getHno() {
	return hno;
}
public void setHno(int hno) {
	this.hno = hno;
}
public String getStreet() {
	return Street;
}
public void setStreet(String street) {
	Street = street;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "AddressBean [hno=" + hno + ", Street=" + Street + ", city=" + city + "]";
}


}
