package com.sathya.app2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
ApplicationContext ctx=new ClassPathXmlApplicationContext("spconfig.xml");
MobileDetails mb=(MobileDetails) ctx.getBean("edao");
//mb.createtable();
//mb.details();
mb.update();
    }
}
