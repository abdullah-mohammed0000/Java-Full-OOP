/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author abdul
 */
public class Parametrised {
    String name,gender;
    int roll;
  
    void setInformation(String n,String g, int r){
        name=n;
        gender=g;
        roll=r;
    }
    void output(){
        System.out.println("Name : "+name);
         System.out.println("Gender : "+gender);
          System.out.println("Roll : "+roll);
          System.out.println("\n\n");
    }
}
