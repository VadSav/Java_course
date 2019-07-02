import java.util.Arrays;
import java.util.Comparator;



public class PersonMain {

	public static void main(String[] args) {
		Person p1=new Person ("Peter",34);
		Person p2=new Person ("Alex",46);
		Person p3=new Person ("Yurii",21);
		
    Person person[]= {p1,p2,p3};
		
		Arrays.sort(args);
	

	for (int i = 0; i < person.length; i++) {
        System.out.println(person[i]);
	}
 	 System.out.println("*****************************************");
	Comparator<Person> comp = new ComparatorByName();
        Arrays.sort(person, comp.thenComparing(new ComparatorByName()));
        

        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i]);
        }
        System.out.println("****************************************");
        
     
        Arrays.sort(person, comp.thenComparing(new ComparatorByAge()));
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i]);
        }
        System.out.println("****************************************");
        
       
	}
        public  static void temp(String str){


	}
}
   