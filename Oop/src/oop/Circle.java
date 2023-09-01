/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author abdul
 */

    public class Circle{
        double p=3.1416;
        int r;
        void Circleset(int t){
        r=t;
    }
        void Circlesetout(){
            System.out.println("Area : "+p*(r*r));
        }
    }

  class Triangle{
       int b;
       int h;
        void Triangleset(int t, int r){
        b=t;
        h=r;
    }
        void Trianglesetout(){
            System.out.println("Area : "+0.5*(b*h));
        }
    }
 class Rectangle{
       int b;
       int h;
        void Rectangleset(int t, int r){
        b=t;
        h=r;
    }
        void Rectanglesetout(){
            System.out.println("Area : "+(b*h));
        }
    }
