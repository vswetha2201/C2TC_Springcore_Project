package com.tnsif.SpringBasic_Project.spring_boot_basic_project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean_stu.xml");

        College college = (College) context.getBean("college");
        college.showCollege();

        Department cse = (Department) context.getBean("cseDept");
        cse.showDepartment();
        ((Student) context.getBean("stu1")).showStudent();
        ((Student) context.getBean("stu2")).showStudent();

        Department aiml = (Department) context.getBean("aimlDept");
        aiml.showDepartment();
        ((Student) context.getBean("stu3")).showStudent();
    }
}

