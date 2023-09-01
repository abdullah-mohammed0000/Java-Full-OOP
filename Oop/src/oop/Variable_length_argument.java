
package oop;


public class Variable_length_argument {
void add(int ...num)   {
    
    int sum=0;
    for(int T:num){
        sum = sum+T;
    }
    System.out.println(sum);
    
    
} 
}
