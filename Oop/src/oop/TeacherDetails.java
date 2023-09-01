/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author abdul
 */
public class TeacherDetails {
    
    public static void main(String[] args){
        Teacher teacher1;
        teacher1= new Teacher();
        teacher1.name="Abdullah Mohammed";
        teacher1.gender="male";
        teacher1.roll=4324;
        
        
         Teacher teacher2;
         teacher2 = new Teacher();
        teacher2.name="Hasan Mohammed";
        teacher2.gender="male";
        teacher2.roll=4324;
        
        
        System.out.println("Name: "+teacher1.name);
         System.out.println("Gender: "+teacher1.gender);
          System.out.println("Roll: "+teacher1.roll);
          
           System.out.println("Name: "+teacher2.name);
         System.out.println("Gender: "+teacher2.gender);
          System.out.println("Roll: "+teacher2.roll);
    }
    
    
}
