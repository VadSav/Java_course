
package telran.employee.controller;

import telran.employee.dao.Company;
import telran.employee.data.*;


public class EmployeeApp {

	public static void main(String[] args) {
		
		//Employee e1 = new Employee(2222, "Vasya", "Ivanov", 23);
		//Employee e2 =new Employee("Ilya", "Muromec");
		
		SalesManager sm1 =new SalesManager(333, "Vasya", "Ivanav", 2, 100, 0.5);
		WageEmployee wm1 = new WageEmployee(444, "Ilya", "Muromec", 30, 12.5);
		SalesManager sm2 =new SalesManager(333, "Vasy", "Ivanav", 80, 1000, 0.5);
		WageEmployee wm2 = new WageEmployee(444, "Ily", "Muromec", 4, 12.5);
		SalesManager sm3 =new SalesManager(333, "Vas", "Ivanav", 80, 10000, 0.5);
		WageEmployee wm3 = new WageEmployee(444, "Il", "Muromec", 50, 12.5);
		
		System.out.println(sm1.calculateSalary());
		System.out.println(wm1.calculateSalary());
		
		Company c1 = new Company(10);
		c1.addEmployee(sm1);
		c1.addEmployee(wm1);
		c1.addEmployee(sm2);
		c1.addEmployee(wm2);
		c1.addEmployee(sm3);
		c1.addEmployee(wm3);
		c1.display();
		System.out.println("************************************");
		c1.removeEmployee(sm1);
		c1.display();
		
		System.out.println(c1.sumSalary());
		

	}

}
