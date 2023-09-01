/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StaticVariablePart1;

public class StaticMethodRestriction {
 //static method cannot access non-static method
 //static method cannot use this and super keyword
    int x =10;
    void display1()
    {   System.out.println(x);
        display2();//non-static method can access static method
        System.out.println("I am non static method");
    }
    static void display2()
    {   //display1(); //static method cannot access non-static method
        //System.out.println(x); //static method cannot access non-static method
        System.out.println("I am static method");
    } 
    
}
