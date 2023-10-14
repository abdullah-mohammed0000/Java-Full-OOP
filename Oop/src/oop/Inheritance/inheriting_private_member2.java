/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.Inheritance;

/**
 *
 * @author abdul
 */
public class inheriting_private_member2 extends inheriting_private_member {
   
    private String qualification;
    
  public String getQualification(){
      return qualification;
  }
  public void setQualification(String qualification){
      this.qualification = qualification;
  }
  
  void display2(){
      display1();
      System.out.println("Qualification: "+getQualification());
  }
  

}