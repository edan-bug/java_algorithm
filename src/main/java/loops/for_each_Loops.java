/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loops;

/**
 *
 * @author ed
 */
public class for_each_Loops {
    // Java program to illustrate
// for-each loop

    public static void main(String[] arg)
    {
        {
            int[] rating = { 1, 5, 10, 20, 30 };
             
            int highest_marks = maximum(rating);
            System.out.println("The highest score is " + highest_marks);
        }
    }
    public static int maximum(int[] numbers)
    {
        int maxSoFar = numbers[0];
         
        // for each loop
        for (int num : numbers)
        {
            if (num > maxSoFar)
            {
                maxSoFar = num;
            }
        }
    return maxSoFar;
    }
}

