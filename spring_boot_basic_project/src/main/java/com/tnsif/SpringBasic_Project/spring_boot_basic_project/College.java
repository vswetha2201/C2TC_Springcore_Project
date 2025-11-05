package com.tnsif.SpringBasic_Project.spring_boot_basic_project;

public class College {
    private String collegeName;

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public void showCollege() {
        System.out.println("College Name: " + collegeName);
    }
}

