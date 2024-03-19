package com.spring.core;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("cfg.xml", "com/spring/collections/collectionscfg.xml");
        Student student = (Student) context.getBean("student");
        Student student1 = (Student) context.getBean("student1");
        com.spring.collections.Student student2 = (com.spring.collections.Student) context.getBean("studentCollection");
        System.out.println(student);
        System.out.println(student1);
        System.out.println(student2.getStudnetName());
    }
}
