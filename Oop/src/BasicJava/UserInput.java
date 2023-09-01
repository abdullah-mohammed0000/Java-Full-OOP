/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BasicJava;
import java.util.Scanner;
/**
 *
 * @author abdul
 */
public class UserInput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number;
        double salary;
        String name;
        System.out.print("Enter Name: ");
   name = input.nextLine();
   
        System.out.print("Enter Number: ");
   number = input.nextInt();
    System.out.println("Enter double Number: ");
   salary = input.nextDouble();
    
   System.out.println(number);
   System.out.println(salary);
   System.out.println(name);
    
    }
}
