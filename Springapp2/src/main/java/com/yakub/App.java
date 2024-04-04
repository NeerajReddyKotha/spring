package com.yakub;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    ApplicationContext ctx=new ClassPathXmlApplicationContext("spconfig.xml");
    Employee e=(Employee)ctx.getBean("id1");
    e.printdetails();
    }
}
