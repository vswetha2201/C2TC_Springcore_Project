package com.tnsif.SpringBasic_Project.spring_boot_basic_project;

public class Department {
    private String departmentName;

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void showDepartment() {
        System.out.println("\nDepartment Name: " + departmentName);
    }

    @Override
    public String toString() {
        return "Department [departmentName=" + departmentName + "]";
    }
}
