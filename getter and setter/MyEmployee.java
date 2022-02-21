package com.get_set;
class Employee{
	 private int EmpID;  
	 private String name;  
	 private String domain;
	 private String position;
	public Employee(int EmpID, String name, String domain, String position){
		this.EmpID=EmpID;  
		this.name=name;  
		this.domain=domain;
		this.position=position;
	 }  
	 public int getEmpid() {
		 return EmpID;
	 }

	 public void setEmpid(int EmpId) {
		 this.EmpID = EmpId;
	 }
	 public String getName() {
		 return name;
	 }

	 public void setName(String name) {
		 this.name = name;
	 }
	 public String getdomain() {
		 return domain;
	 }

	 public void setdomain(String Domain) {
		 this.domain = Domain;
	 }
	 public String getposition() {
		 return position;
	 }

	 public void setposition(String Position) {
		 this.domain = Position;
	 }
	   
	 public String toString(){//overriding the toString() method  
	  return EmpID+" "+name+" "+domain+" "+position;  
	 }  

	
}


public class MyEmployee{
	
	 public static void main(String args[]){  
	   Employee e1=new Employee(101,"likhitha","ML","Analyst");  
	   Employee e2=new Employee(102,"radha","cloud","Researcher");  
	     
	   System.out.println(e1); 
	   System.out.println(e2);  
	 }  
	}  