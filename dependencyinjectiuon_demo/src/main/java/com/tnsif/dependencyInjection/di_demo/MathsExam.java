package com.tnsif.dependencyInjection.di_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MathsExam {

	public static void main(String[] args) {
		
		ApplicationContext con =new ClassPathXmlApplicationContext("bean2.xml");
		
		//setter injection
		Student thamizh=con.getBean("tamil",Student.class);
		Student kalai=con.getBean("kalai",Student.class);
		
		thamizh.showInfo();
		kalai.showInfo();
		
		//Constructor injection
		Student1 sk=con.getBean("sakthi",Student1.class);
		Student1 hm=con.getBean("hema",Student1.class);
		
		sk.showInfo();
		hm.showInfo();
		
	}
}
