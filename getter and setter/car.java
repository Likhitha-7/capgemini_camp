package com.get_set;
class mycar{
	 private String brand;  
	 private String model;  
	 private int price;
	 private String color;
	public mycar(String brand, String model, int price, String color){
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


public class car{
	
	 public static void main(String args[]){  
	   mymobile c1=new mymobile("hyundai","creta","1500000","Black");  
	   mymobile c2=new mymobile("audi","Q8","5000000","white");  
	     
	   System.out.println(c1); 
	   System.out.println(c2);  
	 }  
	}  

