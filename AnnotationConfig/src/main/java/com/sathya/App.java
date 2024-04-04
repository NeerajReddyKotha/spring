package com.sathya;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.sathya")
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext ctx=new AnnotationConfigApplicationContext(EmployeeBean.class);
       EmployeeBean e=ctx.getBean(EmployeeBean.class);
       e.details();
    }
}
