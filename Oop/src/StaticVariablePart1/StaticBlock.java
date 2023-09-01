/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StaticVariablePart1;


public class StaticBlock {
    static int id;
   static String name;
    static{
        id= 222115105;
        name="Abdullah Mohammed";
  }
    
    static void display(){
        System.out.println(id);
        System.out.println(name);
    }
    
     public static void main(String[] args) {
        StaticBlock.display();
    }
}
