package com.kishan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
ApplicationContext ctx=new ClassPathXmlApplicationContext("spconfig.xml");
StudentBean sb=(StudentBean)ctx.getBean("id2");
sb.studetails();
}
}
