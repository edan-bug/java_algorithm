/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sort_algo;

/**
 *
 * @author ed
 */
public class recurse {
    
    public static void main(String[] args) {

        //System.out.println(iterativeFactorial(3));
        System.out.println(recursiveFactorial(0));
        System.out.println(recursiveFactorial(1));
        System.out.println(recursiveFactorial(2));
        System.out.println(recursiveFactorial(3));
        System.out.println(recursiveFactorial(4));
        System.out.println(recursiveFactorial(5));
    }

    // 1! = 1 * 0! = 1
    // 2! = 2 * 1 = 2 * 1!
    // 3! = 3 * 2 * 1 = 3 * 2!
    // 4! = 4 * 3 * 2 * 1 = 4 * 3!

    // n! = n *(n - 1)!

    public static int recursiveFactorial(int num) {

        if (num == 0) {
            return 1;
        }

        return num * recursiveFactorial(num - 1);

    }

    public static int iterativeFactorial(int num) {

        if (num == 0) {
            return 1;
        }

        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        return factorial;

    }
}

    

