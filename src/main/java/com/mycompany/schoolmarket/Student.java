/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.schoolmarket;

/**
 *
 * @author utentepc
 */
public class Student {
    
    private String firstName;
    private String lastName;
    private int age;
    private String classSection;

    public Student(String firstName, String lastName, int age, String classSection) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.classSection = classSection;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getClassSection() {
        return classSection;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setClassSection(String classSection) {
        this.classSection = classSection;
    }

    
    
    
    @Override
    public String toString() {
        return "\n" +" firstName=" + firstName + "\n lastName=" + lastName + "\n age=" + age + "\n classBefore=" + classBefore;
    }

    

}