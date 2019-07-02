import java.util.Arrays;

public class PersonMain {

	public static void main(String[] args) {
		
		Person p1= new Person("Ivan",15);
		Person p2= new Person("Peter",27);
		Person p3= new Person("Max",43);
		Person p4= new Person("Georgiy",39);
		
        Person[]persons= {p1,p2,p3,p4};
        System.out.println(p1.compareTo(p2));
        
        Arrays.sort(persons);
        for(Person person: persons) {
        	System.out.println(person);
        }



	}
}
	


