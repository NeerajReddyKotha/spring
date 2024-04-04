package com.sathya;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class JavaConfig {
	@Bean("id1")
public Consumer getconConsumer() {
Consumer c=new Consumer();
Scanner s=new Scanner(System.in);
System.out.println("enter your cid");
int id=s.nextInt();
System.out.println("enter your name");
	String name=s.next();
System.out.println("enter your prevoius reading");
int pr= s.nextInt();
System.out.println("enter your current reading");
int cr= s.nextInt();
c.setCid(id);
c.setCname(name);
c.setPrevious_reading(pr);
c.setCurrent_reading(cr);
	return c;

}
	
	
}
