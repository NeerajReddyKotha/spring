package com.sathya.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("spconfig.xml");
        SathyaCollegeBean scb=(SathyaCollegeBean) ctx.getBean("id1");
        scb.StudentDeatils();
    }
}
