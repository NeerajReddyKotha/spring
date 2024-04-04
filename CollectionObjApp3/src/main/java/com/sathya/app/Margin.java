package com.sathya.app;

public class Margin {
private int mrgId;
private String mrgCode;
public Margin() {
	super();
}
public int getMrgId() {
	return mrgId;
}
public void setMrgId(int mrgId) {
	this.mrgId = mrgId;
}
public String getMrgCode() {
	return mrgCode;
}
public void setMrgCode(String mrgCode) {
	this.mrgCode = mrgCode;
}
@Override
public String toString() {
	return "Margin [mrgId=" + mrgId + ", mrgCode=" + mrgCode + "]";
}
}
