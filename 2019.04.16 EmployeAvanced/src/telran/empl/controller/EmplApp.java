package telran.empl.controller;


import telran.empl.dao.Company;
import telran.empl.entity.*;
 
public class EmplApp {
 
    public static void main(String[] args) {
         
        Company c1= new Company(10);
        SalesManager sm1= new SalesManager(777, "Vas", "Pes", 50, 200000, 0.1);
        SalesManager sm2= new SalesManager(778, "RRR", "Pes", 50, 200, 0.1);
        SalesManager sm3= new SalesManager(779, "PPP", "Pes", 50, 150000, 0.1);
         
        WageEmployee we1= new WageEmployee(888, "Per", "Kul", 80, 9.12);
        WageEmployee we2= new WageEmployee(889, "Ru", "Kul", 30, 9.12);
        WageEmployee we3= new WageEmployee(877, "Ru", "Kul", 30, 9.12);
        WageEmployee we4= new WageEmployee(289, "Ru", "Kul", 30, 9.12);
        WageEmployee we5= new WageEmployee(887, "Mar", "Kul", 70, 9.12);
         
        c1.addEmployee(sm1);
        c1.addEmployee(sm2);
        c1.addEmployee(sm3);
        c1.addEmployee(we1);
        c1.addEmployee(we2);
        c1.addEmployee(we3);
        c1.addEmployee(we4);
        c1.addEmployee(we5);
         
        System.out.println(sm1.calculateSalary());
        System.out.println(sm1.calculateTax());
        sm1.showtax();
        System.out.println("******************");
         
        System.out.println("Min Salary"+ c1.minSalary());
        System.out.println("Max salary "+c1.maxSalary());
        System.out.println("FOT "+c1.sumSalary());
        System.out.println(c1.employeeMinSalary());
        System.out.println("*************");
        System.out.println(c1.poorMens(3));
        c1.display(c1.poorMens(4));
         
    }
 
}