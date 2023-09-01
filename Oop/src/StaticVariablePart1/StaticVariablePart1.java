/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StaticVariablePart1;

/**
 *
 * @author abdul
 */
public class StaticVariablePart1 {
String name;
int id;
static String university ="LU";

StaticVariablePart1(String n, int i){
    name = n;
    id = i;
}
void display(){
    System.out.println("Name: "+name);
    System.out.println("Id: "+id);
    System.out.println("University: "+university);
    System.out.println();
}
}
