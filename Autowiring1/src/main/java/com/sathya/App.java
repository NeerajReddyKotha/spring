package com.sathya;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {

    	ApplicationContext  ctx=new ClassPathXmlApplicationContext("spconfig.xml");
    	EmployeeBean a=(EmployeeBean) ctx.getBean("id2");
        a.printdetails();    }
}
