package com.yakub.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext  ctx=new ClassPathXmlApplicationContext("spconfig.xml");
    	AdditionBean a=(AdditionBean) ctx.getBean("id1");
        a.printaddition();
    }
}
