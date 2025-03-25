package com.example.summit_power_company_.Mariyum;

import java.time.LocalDate;

public class Employee {
    private int id;
    private String name;
    private LocalDate dob;
    private String department;
    private float salary;

    public Employee(int id, String name, LocalDate dob, String department, float salary) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
