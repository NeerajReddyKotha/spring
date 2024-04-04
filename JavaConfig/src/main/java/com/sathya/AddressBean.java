package com.sathya;

public class AddressBean {
private int hno;
private String city;
private String State;
public AddressBean() {
}
public AddressBean(int hno, String city, String state) {
	this.hno = hno;
	this.city = city;
	State = state;
}
@Override
public String toString() {
	return "AddressBean [hno=" + hno + ", city=" + city + ", State=" + State + "]";
}

}
