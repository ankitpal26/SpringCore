package com.springcore;

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
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("studentconfig.xml");
        ApplicationContext context2 = new ClassPathXmlApplicationContext("empconfig.xml");
        
        Student student1 =(Student) context.getBean("student1");
        Emp emp =(Emp) context2.getBean("emp1");
//        Student student2 =(Student) context.getBean("student2");
        System.out.println(student1);
        System.out.println(emp);
//        System.out.println(student2);
        
        
        
    }
}
