package com.kishan;

public class Product {
private int proid;
private String proname;
private double price;
private int quantity;
public Product() {
}
public int getProid() {
	return proid;
}
public void setProid(int proid) {
	this.proid = proid;
}
public String getProname() {
	return proname;
}
public void setProname(String proname) {
	this.proname = proname;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public void productdetails() {
	double total;
	double discount;
	double invoice;
	total=price*quantity;
	if (total<35000) {
		discount=(total*15)/100;
		invoice=total-discount;
	}
	else {
		discount=(total*25)/100;
		invoice=total-discount;
	}
	System.out.println(proid);
	System.out.println(proname);
	System.out.println(price);
	System.out.println(quantity);
	System.out.println(total);
	System.out.println(discount);
	System.out.println(invoice);


}
}
