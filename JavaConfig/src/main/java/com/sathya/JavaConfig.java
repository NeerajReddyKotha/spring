package com.sathya;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class JavaConfig {
	@Bean("id1")
public EmployeeBean getemp()
{ 
AddressBean ab=new AddressBean(102, "hanamkonda", "telangana");
	
EmployeeBean e1=new EmployeeBean();
Scanner sc =new Scanner(System.in);
System.out.println("enter id,name,designation");

int id=sc.nextInt();
e1.setEid(id);
String name=sc.next();
e1.setEname(name);
String des=sc.next();
e1.setDesignation(des);
e1.setAddr(ab);
return e1;
	
}	
	
	
	
	
}
