/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThisKeyword;

/**
 *
 * @author abdul
 */
public class Person {
    String name;
    int roll;
    String hairColor;
    Person(String name,int roll)
    {
       this.name=name;
        this.roll=roll;
    }
    Person(String name,int roll,String hairColor){
        this(name,roll);
        this.hairColor=hairColor;
    }
    
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Roll: "+roll);
        System.out.println("Hair Color : "+hairColor);
    }
}
