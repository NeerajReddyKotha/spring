package com.sathya.app1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("spconfig.xml");
        MobileData d=(MobileData) ctx.getBean("edao");
        //d.createtable();
       // d.dataInsert();
       // d.updateDetails();
        //  d.deleteDetails();
    //d.getonerecord();
   d.getallrecord();
    }
}
