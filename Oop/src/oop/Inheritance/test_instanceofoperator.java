/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.Inheritance;

/**
 *
 * @author abdul
 */
public class test_instanceofoperator {
    public static void main(String[] args) {
    animal_instanceofoperator a = new  animal_instanceofoperator();
    person_instanceofoperator  p = new  person_instanceofoperator();     
    teacher_instanceofoperator t = new  teacher_instanceofoperator();
    
        System.out.println(a instanceof   animal_instanceofoperator);
      System.out.println(p instanceof   animal_instanceofoperator);
       System.out.println(t instanceof   person_instanceofoperator);
       System.out.println(t instanceof   animal_instanceofoperator);
       System.out.println(p instanceof   teacher_instanceofoperator);
      System.out.println(p instanceof   animal_instanceofoperator);
     
    }  
}
