/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThisKeyword;

/**
 *
 * @author abdul
 */
public class Shape {
    double radius,base,height;
    int side1,side2;
    
    Shape(double radius){
        this.radius=radius;
    }
    Shape(double base,double height)
    {
        this.base=base;
        this.height=height;
    }
    Shape(int side1,int side2){
        this.side1=side1;
        this.side2=side2;
    }
    
    void circlearia(){
        System.out.println("Area = : "+3.1416*(radius*radius));
    }
     void rectanglearia(){
        System.out.println("Area = : "+base*height);
    }
      void trianglearia(){
        System.out.println("Area = : "+0.5*(side1*side2));
    }
}
