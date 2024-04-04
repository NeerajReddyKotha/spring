package com.sathya;

public class Consumer {
private int cid;
private String cname;
private int previous_reading;
private int current_reading;
public Consumer() {
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public int getPrevious_reading() {
	return previous_reading;
}
public void setPrevious_reading(int previous_reading) {
	this.previous_reading = previous_reading;
}
public int getCurrent_reading() {
	return current_reading;
}
public void setCurrent_reading(int current_reading) {
	this.current_reading = current_reading;
}
public void electricityBill() 
{
	int units=current_reading-previous_reading;
double total = 0;
if (units<300) {
	total=units*1.75;
}
else if (units>=300&&units>500) {
	total=units*5.25;
}
else if (units>500) {
	total=units*7.25;
}
	System.out.println("Consumer Id:"+cid);
	System.out.println("Consumer_Name:"+cname);
	System.out.println("previous_reading:"+previous_reading);
	System.out.println("current_reading"+current_reading);
	System.out.println("units:"+units);
	System.out.println("Total Bill"+total);
}

}
