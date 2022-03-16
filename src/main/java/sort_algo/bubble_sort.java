/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sort_algo;

/**
 *
 * @author ed
 */
public class bubble_sort {
    
    public static void main (String [] args){
        
        int[] intArray = {20, 35, -15, 7, 50, 35};
        
        for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex >0; lastUnsortedIndex -- ){
            for(int i=0; i < lastUnsortedIndex; i++){
                if(intArray[i] > intArray[i +1]){
                    swap(intArray, i, i+1);
                }
            }
        }
        for(int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }
    
    
    public static void swap(int[] array, int i, int j){
        
        int temp = array[i];
        array [i] = array [j];
        array [j] = temp;
    }
    
}
