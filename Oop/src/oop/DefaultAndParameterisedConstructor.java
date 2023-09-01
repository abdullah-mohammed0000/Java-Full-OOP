/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author abdul
 */
public class DefaultAndParameterisedConstructor {
    double radius,base,height;
    int side1,side2;
    DefaultAndParameterisedConstructor(){
        System.out.println("No value");
    }
     
    DefaultAndParameterisedConstructor(double r){
        radius = r;
    }
    DefaultAndParameterisedConstructor(double b, double h){
        base = b;
        height = h;
    }
    
    DefaultAndParameterisedConstructor(int s1,int s2){
        side1 = s1;
        side2 = s2;
    }
     void CircleArea(){
         System.out.println("Area: "+3.1416*(radius*radius));
     }
  void    RectangleArea(){
         System.out.println("Area: "+(base*height));
     }
   void    TriangleArea(){
         System.out.println("Area: "+0.5*(side1*side2));
     }
}
