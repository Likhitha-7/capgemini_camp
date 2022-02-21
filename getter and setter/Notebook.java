package com.get_set;
class mynotebook{
	private String brand;  
	private String model;  
	private int price;
	private String Size;
	public mynotebook(String brand, String model, int price, String Size){
		this.brand=brand;  
		this.model=model;  
		this.price=price;
		this.Size=Size;
	 }  
	 public String getbrand() {
		 return brand;
	 }

	 public void setbrand(String brand) {
		 this.brand = brand;
	 }
	 public String getmodel() {
		 return model;
	 }

	 public void setmodel(String model) {
		 this.model = model;
	 }
	 public int getprice() {
		 return price;
	 }

	 public void setprice(int price) {
		 this.price = price;
	 }
	 public String getSize() {
		 return Size;
	 }

	 public void setSize(String Size) {
		 this.Size = Size;
	 }
	   
	 public String toString(){//overriding the toString() method  
	  return brand+" "+model+" "+price+" "+Size;  
	 }  

	
}


public class Notebook{
	
	 public static void main(String args[]){  
	   mynotebook n1=new mynotebook("classmate","A4",50,"ruled");  
	   mynotebook n2=new mynotebook("urban edge","king",40,"unruled");  
	     
	   System.out.println(n1); 
	   System.out.println(n2);  
	 }  
	}  

