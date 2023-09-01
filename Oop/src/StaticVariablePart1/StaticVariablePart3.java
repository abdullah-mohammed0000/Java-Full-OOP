/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StaticVariablePart1;

/**
 *
 * @author abdul
 */
public class StaticVariablePart3 {
//int count = 0; //non-static variable take memory separately for every object. That's why output is coming as 1 always
static int count =0;
 StaticVariablePart3 (){
     count++;
 }
 void TotalStudent(){
     System.out.println("Total Student: "+count);
 }
}
