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
    
    public void setQua(String qua){
        qualification = qua;
    }
    public String getQua(){
    return qualification;
}
    
    void display(){
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getQua());
    }
    

}