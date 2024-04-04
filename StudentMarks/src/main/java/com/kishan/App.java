package com.kishan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx=new ClassPathXmlApplicationContext("spconfig.xml");
    	StudentMarks std=(StudentMarks)ctx.getBean("id1");
    	std.details();
    }
}
