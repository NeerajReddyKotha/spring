package com.sathya;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    ApplicationContext ctx=new ClassPathXmlApplicationContext("spconfig.xml");
    StudentBean sb=(StudentBean)ctx.getBean("edao");
   //sb.detais();
    //sb.insertmethod();
    //sb.updatemethod();
   //sb.getonerecord();
    //sb.getallrecord();
    sb.deleterecord();
    }
    
}
