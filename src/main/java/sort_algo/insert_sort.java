/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sort_algo;

/**
 *
 * @author ed
 */
public class insert_sort {
    
    public static void main(String[] args){
        
        int[] intArray = {20, 35, -15, 7, 55, 1, -22,};
        
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++){
            int newElement = intArray[firstUnsortedIndex];
            
            int i;
            
            for(i = firstUnsortedIndex; i>0 && intArray[i - 1] > newElement; i-- ){
                intArray[i] = intArray[i - 1];
                
        }
            intArray[i] = newElement;
    }
        for(int i =0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    
    }
}