
import java.util.Comparator;

public class ComparatorByAge  implements Comparator<Person>{
	
	public int compare(Person o1, Person o2) {
		return (int)(o1.getAge()-o2.getAge());
	}
		


}