package com.kishan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	@SuppressWarnings("resource")
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spconfig.xml");
    	Product p=(Product)ctx.getBean("id");
    	p.productdetails();
    }
}