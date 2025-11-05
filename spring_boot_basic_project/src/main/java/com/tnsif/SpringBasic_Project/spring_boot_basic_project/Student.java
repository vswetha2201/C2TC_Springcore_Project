package com.tnsif.SpringBasic_Project.spring_boot_basic_project;

public class Student {
    private int id;
    private String name;
    private double mark;
    private boolean check;
    private Department department;

    // Setters for dependency injection
    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setMark(double mark) { this.mark = mark; }
    public void setCheck(boolean check) { this.check = check; }
    public void setDepartment(Department department) { this.department = department; }

    public void showStudent() {
        System.out.println("Student [id=" + id + ", name=" + name + ", mark=" + mark +
                ", check=" + check + ", department=" + department + "]");
    }
}
