package com.capg_day4;
public class countOccurence
{
  public static void main(String args[]) 
  {
      
  String input = "asdfghfawefvdsa";
  char search = 'a';             
  
  int count=0;
  for(int i=0; i<input.length(); i++)
  {
      if(input.charAt(i) == search)
      count++;
  }
  
  System.out.println("The Character '"+search+"' appears "+count+" times.");
  }
}