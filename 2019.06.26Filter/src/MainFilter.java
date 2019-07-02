
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainFilter {

	public static void main(String[] args) {
		
		Address a1= new Address("Kosmonavtov",25);
		Address a2= new Address("Stroitelei",40);
		Address a3= new Address("Komsomolskaya",71);
		Address a4= new Address("Lenina",19);
		
		Person p1=new Person("Leo",23,a1);
		Person p2=new Person("Moisha",51,a2);
		Person p3=new Person("Kuzma",40,a3);
		Person p4=new Person("Nikolay",15,a4);
		Person [] p= {p1,p2,p3,p4};
		
		Stream<Person> personsStream = Stream.of(p); 
               
personsStream.filter(i->i.getAge()>17).forEach(i->System.out.println(i.getAddress()));

      System.out.println("************************************************");
      
      Stream<String>ivan=Stream.of("Ivan","Piotr","Ivan","Piotr","Maria");
      Set<String>collect1 =ivan.collect(Collectors.toSet());
      System.out.println(collect1);
      
	}
}

	      

	    

	


