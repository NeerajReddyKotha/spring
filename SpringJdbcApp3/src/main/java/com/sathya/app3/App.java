package com.sathya.app3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Hp
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("spconfig.xml");
      ProductDetails pd=(ProductDetails) ctx.getBean("edao");
     // pd.createtable();
      pd.insertvalues();
  //  pd.updaterecords();
//    pd.getonerecord();
    //  pd.deleterecords();
 // pd.getallrecord();  
    }
}
