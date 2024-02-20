/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorphisme;

/**
 *
 * @author chiara
 */
public class Employee extends Person {
    
    float salary = 4000f;
    String name = "Dian";
    int age = 23;
      
    public void showInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Salary: $" + salary);
    }
}
