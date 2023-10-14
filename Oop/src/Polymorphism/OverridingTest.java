/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism;

/**
 *
 * @author abdul
 */
public class OverridingTest {
    public static void main(String[] args) {
         MethodOverride1 m1 = new  MethodOverride1();
         m1.name = "Abdullah Mohammed";
         m1.age=23;
         m1.qualification = "Jannat";
         m1.display();
         
          MethodOverride m2 = new  MethodOverride();
         m2.name = "Abdullah Mohammed";
         m2.age=23;
     
         m2.display();
    }
}
