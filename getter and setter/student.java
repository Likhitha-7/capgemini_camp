package com.get_set;
class Mystudent{
	 private int rollno;  
	 private String name;  
	 private String city;  
	public Mystudent(int rollno, String name, String city){
		this.rollno=rollno;  
		this.name=name;  
		this.city=city;  
	 }
	public int getNo() {
		 return rollno;
	 }

	 public void setNo(int rollno) {
		 this.rollno = rollno;
	 }
	 public String getName() {
		 return name;
	 }

	 public void setName(String name) {
		 this.name = name;
	 }
	 public String getCity() {
		 return city;
	 }

	 public void setCity(String city) {
		 this.city = city;
	 }
	   
	 public String toString(){//overriding the toString() method  
	  return rollno+" "+name+" "+city;  
	 }  

	
}


public class student{
	
	 public static void main(String args[]){  
	   Mystudent s1=new Mystudent(101,"likhitha","hyderabad");  
	   Mystudent s2=new Mystudent(102,"radha","pune");  
	     
	   System.out.println(s1);  
	   System.out.println(s2);  
	 }  
	}  