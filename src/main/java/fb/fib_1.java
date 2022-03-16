/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package fb;

import java.util.Scanner;

/**
 *
 * @author ed
 */
 class fib_1 {

    public static void main (String[]args){

        System.out.println("Enter number upto which Fibonacci series to print: "); 

        int number = new Scanner(System.in).nextInt();
        
        for(int i=1; i <= number; i++){
        
        }
        
        System.out.println("Fibonacci series upto " + number +" numbers : "); 
        for(int i=1; i<=number; i++){ System.out.print(fibonacci2(i) +" "); }

        
        

    }
    
    

    public static int fibonacci2(int number){

    if(number == 1 || number == 2){
        return 1;
    }
    
    int fib_1 = 1;
    int fib_2 = 2;
    int fibonacci = 1;
    
    for(int i=3;i <=number; i++){
        
        
        fibonacci = fib_1 + fib_2;
        fib_1 = fib_2;
        fib_2 = fibonacci;
        
    }
    
    return fibonacci;
    
            
    
    }
    
 

}
