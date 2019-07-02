package telran.computers.controller;

import telran.computers.entity.*;

public class ComputerAppl {

	public static void main(String[] args) {
	computer c1=new computer(12, 120," intel"," Lenovo");
	System.out.println(c1);
	
Laptop l1=new Laptop(16, 160, "AMD", "Dell", 1, 9);
System.out.println(l1);
Smartphone sm1=new  Smartphone(12, 1000, "Samsung", "Samsung", 12345);
System.out.println(sm1);
boolean res1=c1.equals(l1);
System.out.println(res1);
Laptop l2= new Laptop(16, 160, "AMD", "Dell", 1, 9);
boolean res2=l2.equals(l1);
System.out.println(res2);

computer arr1[]= new computer[3];
arr1 [0]=c1;
arr1 [2]=l1;
arr1 [2]=sm1;
l2.setBrand("Chudo");
String str1=l1.getClass().toString();
System.out.println(str1);
String str2=l2.getBrand();
System.out.println(str2);

	}
	

}
