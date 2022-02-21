package com.get_set;
class mymobile{
	 private String brand;  
	 private String model;  
	 private String IMEI_no;
	 private String color;
	public mymobile(String brand, String model, String IMEI_no, String color){
		this.brand=brand;  
		this.model=model;  
		this.IMEI_no=IMEI_no;
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
	 public String getimei() {
		 return IMEI_no;
	 }

	 public void setimei(String IMEI_no) {
		 this.IMEI_no = IMEI_no;
	 }
	 public String getcolor() {
		 return color;
	 }

	 public void setcolor(String color) {
		 this.color = color;
	 }
	   
	 public String toString(){//overriding the toString() method  
	  return brand+" "+model+" "+IMEI_no+" "+color;  
	 }  

	
}


public class Mobile{
	
	 public static void main(String args[]){  
	   mymobile m1=new mymobile("apple","iphone11","G123EF3456","Black");  
	   mymobile m2=new mymobile("samsung","s9","H12334RDFB","white");  
	     
	   System.out.println(m1); 
	   System.out.println(m2);  
	 }  
	}  