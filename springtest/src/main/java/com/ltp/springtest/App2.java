package com.ltp.springtest;

import org.springframework.beans.DerivedTestBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App2 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
    	
    	context.getBean("derivedTestBean");
//    	DerivedTestBean dtb = (DerivedTestBean) context.getBean("derivedTestBean");
    	
//    	System.out.println(dtb.getName()+"===="+dtb.getAge());
//    	TestBean tb = (TestBean) context.getBean("inheritedTestBean");
//    	System.out.println(tb.getName()+"===="+tb.getAge());
    	
    }
}
