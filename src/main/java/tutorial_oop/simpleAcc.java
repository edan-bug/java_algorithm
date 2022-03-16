/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial_oop;

/**
 *
 * @author ed
 */



public class simpleAcc {
    
    int account_number = 2321222;
    int account_balance = 8000;

 
    public void showAcc(){
        
        System.out.println("account_number" + account_number);
        System.out.println("account_balance" + account_balance);
    
    }
    
    public static void main (String []args){
        
        simpleAcc a = new simpleAcc();
        simpleAcc b = new simpleAcc();
        
        System.out.println(a.account_number);
        System.out.println(b.account_balance);
        
    }

}
    
