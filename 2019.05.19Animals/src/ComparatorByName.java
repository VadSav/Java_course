
import java.util.Comparator;

public class ComparatorByName implements Comparator <WildAnimals>{

	
		
		


	@Override
	public int compare(WildAnimals o1, WildAnimals o2) {
		return o1.getColor().compareTo(o2.getColor());
		
	}



}