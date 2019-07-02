package telran.employee.controller;

import telran.employee.entity.SalesManager ;
import telran.employee.entity.WageEmployee;



public class EmployeeApp {

	public static void main(String[] args) {
		public static void main(String[] args) {
			SalesManager sm1 = new SalesManager(777, "sdfsdf", "lastName", 240, 234, 0.1);
			WageEmployee wm1 = new WageEmployee(333, "ddd", "bbb", 12, 12);
			
			System.out.println(sm1.calculateSalary());
			System.out.println(wm1.calculateSalary());

		}

	}
