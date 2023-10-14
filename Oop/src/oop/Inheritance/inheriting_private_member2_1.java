/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.Inheritance;

/**
 *
 * @author abdul
 */
public class inheriting_private_member2_1 {
  public static void main(String[] args){
      inheriting_private_member2 in = new inheriting_private_member2 ();
      in.setName("Abdullah Mohammed");
      in.setAge(23);
      in.setQualification("BSc in CSE");
      in.display2();
      
        inheriting_private_member2 in1 = new inheriting_private_member2 ();
      in1.setName("Abdullah");
      in1.setAge(23);
      in1.setQualification("BSc in CSE");
      in1.display2();
  }
}
