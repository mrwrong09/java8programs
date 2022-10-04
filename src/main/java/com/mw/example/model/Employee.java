package com.mw.example.model;

import java.util.List;

public class Employee {

    private String firstName;
    private String lastName;
    private String id;
    private Double salary;
    private List<String> projects;

    public Employee() {
    }
    public Employee(String firstName, String lastName, String id, Double salary, List<String> projects) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.salary = salary;
        this.projects = projects;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public List<String> getProjects() {
        return projects;
    }

    public void setProjects(List<String> projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id='" + id + '\'' +
                ", salary=" + salary +
                ", projects=" + projects +
                '}';
    }
}
