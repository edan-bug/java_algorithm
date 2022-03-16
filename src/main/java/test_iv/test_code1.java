/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test_iv;

/**
 *
 * @author ed
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class test_code1 {
     public static void main(String[] args) throws Exception {
         // Decide card band based on income
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         System.out.print("Key in age: ");
         String age = br.readLine();
         System.out.print("Key in annual income: ");
         String income = br.readLine();
         
         Map<String, String> params = new HashMap<String, String>();
         params.put("age", age);
         params.put("income", income);
         
         new test_code1().getCardBand(params);
     }
     
     public void getCardBand(final Map<String, String> params) {
         int ageScore = getAgeScore(params.get("age"));
         int incomeScore = getIncomeScore(params.get("income"));
         
         if (incomeScore == 1) {
             System.out.println("Standard card");
             return;
         } else if (incomeScore == 2) {
             if (ageScore > 0 && ageScore < 2) {
                 System.out.println("Gold card");
                 return;
             } else if (ageScore > 1) {
                 System.out.println("Platinum card");
                 return;
             }
         } else if (incomeScore == 3) {
             if (ageScore == 1) {
                 System.out.println("Gold card");
                 return;
             } else if(ageScore == 2) {
                 System.out.println("Titanium card");
                 return;
             }
         }
         System.out.println("Failed to apply credit card");
     }
     
     public int getAgeScore(final String ageStr) {
         int age = Integer.valueOf(ageStr);
         
         if (age < 21) {
             return 0;
         } else if (age < 50) {
             return 2;
         } else if (age < 60) {
             return 1;
         } else {
             return 0;
         }
     }
     
     public int getIncomeScore(final String incomeStr) {
         double income = Double.valueOf(incomeStr);
         
         if (income < 10000) {
             return 0;
         } else if (income < 30000) {
             return 1;
         } else if (income < 60000) {
             return 2;
         } else {
             return 3;
         }
    }
 }


