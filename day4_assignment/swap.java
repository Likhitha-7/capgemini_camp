package com.capg_day4;
import java.util.*;

class swap
{    
    public static void main(String args[])
    {
        
        String a = "apple";
        String b = "banana";
          
        
        System.out.println("Strings before swap: a = " + 
                                       a + " and b = "+b);
          
        
        a = a + b;
          
        
        b = a.substring(0,a.length()-b.length());
          
        
        a = a.substring(b.length());
          
        
        System.out.println("Strings after swap: a = " + 
                                     a + " and b = " + b);        
    }    
}