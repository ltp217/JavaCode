package com.ltp.springtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	
    	
    	/*ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext(
                new String []{"applicationContext.xml"});

        ctx.registerShutdownHook();
        System.out.println(ctx.getBean("userDao"));*/
        
//    	System.out.println(context.getBean("a"));
    	
//    	ExampleBean eb = (ExampleBean) context.getBean("exampleBean");
//    	System.out.println(eb);
    	
    	
    	/*User user = (User) context.getBean("user");
    	UserDao userDao = (UserDao) context.getBean("userDao");
    	UserService userService = (UserService) context.getBean("userService");
    	UserService userService2 = (UserService) context.getBean("userService2");
    	System.out.println(userService.equals(userService2));
    	System.out.println(userService.hashCode()+"===="+userService2.hashCode());
    	
    	
//    	System.out.println(user);
    	System.out.println(userDao);
//    	System.out.println(userService);
//      System.out.println( "Hello World!" );
    	TeacherDao teacherDao = (TeacherDao) context.getBean("teacherDao");
    	System.out.println(teacherDao);*/
    }
}
