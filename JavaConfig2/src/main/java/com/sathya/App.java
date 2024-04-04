package com.sathya;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx=new AnnotationConfigApplicationContext(JavaConfig.class);
        Consumer e=(Consumer) ctx.getBean("id1");
        e.electricityBill();
    }
}
