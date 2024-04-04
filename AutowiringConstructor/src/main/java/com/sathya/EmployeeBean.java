package com.sathya;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class EmployeeBean {
private AddressBean addr;


public EmployeeBean() {
	super();
}

@Autowired 
public EmployeeBean(AddressBean addr) {
	super();
	this.addr = addr;
}


public void details() 
{
System.out.println(addr);	
}

}
