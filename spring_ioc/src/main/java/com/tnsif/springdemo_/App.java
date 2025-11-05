package com.tnsif.springdemo_;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
              ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
              System.out.println("bean are loaded");
              Mobile mobile = context.getBean("mobile", Mobile.class);//handling using beans.xml file without changing anything in main code and only using configuration file called beans.xml and loose-coupling happened
              
              mobile.call();
              mobile.data();
    }
}
