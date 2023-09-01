/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author abdul
 */
public class DefaultAndParameterisedConstructor2 {
    
    public static void main(String[] args) {
        
    
     DefaultAndParameterisedConstructor circle = new  DefaultAndParameterisedConstructor(4);
     circle.CircleArea();
     DefaultAndParameterisedConstructor rectangle = new  DefaultAndParameterisedConstructor(5.443,6.453);
     rectangle.RectangleArea();
     DefaultAndParameterisedConstructor triangle = new  DefaultAndParameterisedConstructor(4,5);
     triangle.TriangleArea();
     DefaultAndParameterisedConstructor auto = new  DefaultAndParameterisedConstructor();
     auto.TriangleArea();
    } 
    
    
}
