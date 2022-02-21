package com.get_set;
class mypen{
	 private String brand;  
	 private String model;  
	 private int price;
	 private String color;
	public mypen(String brand, String model, int price, String color){
		this.brand=brand;  
		this.model=model;  
		this.price=price;
		this.color=color;
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
	 public String getcolor() {
		 return color;
	 }

	 public void setcolor(String color) {
		 this.color = color;
	 }
	   
	 public String toString(){//overriding the toString() method  
	  return brand+" "+model+" "+price+" "+color;  
	 }  

	
}


public class Pen{
	
	 public static void main(String args[]){  
	   mymobile p1=new mymobile("Reynolds","jetter","20","Black");  
	   mymobile p2=new mymobile("cello","butterflow","10","white");  
	     
	   System.out.println(p1); 
	   System.out.println(p2);  
	 }  
	}  

