import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
//		
//		 List<String> address = new ArrayList<String>();
//		 List<String> person = new ArrayList<String>();
//		
//		 address.add("Resident str."+" "+"23");
//		 address.add("Warshauer str."+" "+"41");
//		 address.add("Linkolin str."+" "+"128");
//		 address.add("Gabrial str."+" "+ "79");
//		 address.add("Yorck str."+" "+ "90");
//	
//		 person.add("Ivan");
//		 person.add("Viktor");
//		 person.add("Dmitry");
//		 person.add("Iogan");
//		 person.add("Roman");
//		
//		 System.out.println(person.get(0)+" "+address.get(0));
//		 System.out.println(person.get(1)+" "+address.get(1));
//		 System.out.println(person.get(2)+" "+address.get(2));
//		 System.out.println(person.get(3)+" "+address.get(3));
//		 System.out.println(person.get(4)+" "+address.get(4));
		 System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		 Address a1=new Address("Resident str.",23);
		 Address a2=new Address("Warshauer str.",41);
		 Address a3=new Address("Linkolin str.",128);
		 
		Person p1=new Person ("Ivan", a1);
		Person p2=new Person ("Viktor",a2);
		Person p3=new Person ("Dmitry",a3);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		List<Person> persons = new ArrayList<>();
		persons.add(p1);
	    persons.add(p2);
	    persons.add(p3);
	    System.out.println(getAddresses (persons));
		
	}
	
	public static List<Address> getAddresses(List<Person> persons){
		List<Address> addresses = new ArrayList<>();
		for (int i = 0; i < persons.size(); i++) {
			Person person = persons.get(i);
			Address address = person.getAddress();
			addresses.add(address);
			
		}
		return addresses;		
	}
	
	public static List<Address> getAddresses2(List<Person> persons){
		List<Address> addresses = new ArrayList<>();
		for (Person person: persons) {
			addresses.add(person.getAddress());
			
		}
		return addresses;		
	}
	
}
