package telran.person.contrller;

import telran.person.data.ArrayTools;
import telran.person.data.Person;

public class PersonApp {

	private static Object[] arr;

	public static void main(String[] args) {
	
Person p1= new Person ();
p1.setId (14);
p1.setFirstName("Vova");
p1.setLastName("Pu");
p1.setId(12345);
p1.setSex((true));
p1.display();
System.out.println("************");

	Person p2= new Person ();

	p2.setId (11);
	p2.setFirstName("Masha");
	p2.setLastName("Medvedeva");
	p2.setId(123456);
	p2.setSex((false));
	p2.display();
	
	
	Person p3 =new Person ();
	p3.setId (14);
	p3.setFirstName("Vatrushka");
	p3.setLastName("Petrushka");
	p3.setId(333);
	p3.setSex(true);
	p3.display();
	
	System.out.println("******");
	p1.greetings("Dear");
	p2.greetings("Mrs");
	p3.greetings("Bla bla bla ");
	System.out.println("*******");
	p1.greetings("Mr",2);
	p2. greetings ("Mrs",3);
	p3 . greetings ("Hello",14);
	
	Person[] arr1 =new Person [3];
	arr1[0]=p1;
	arr1[1]= p2;
	arr1[2] =p3;
	
	
	
	System.out.println();
	System.out.println(arr1[1]);
	
	Person Array(arr1);
	
	}
}