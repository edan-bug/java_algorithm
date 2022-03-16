/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test_iv;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author ed
 */
public class str_rev {
    
    public static String rev(String rev_st) throws Exception{
        
        StringBuilder sb = new StringBuilder(rev_st);
        
        sb.reverse();
        
        return sb.toString();
    }
    
    public static void main(String [] args) throws Exception{
        System.out.println(str_rev.rev("abcd"));
        //System.out.println(str_rev.rev("dcba"));
    }
    
}
