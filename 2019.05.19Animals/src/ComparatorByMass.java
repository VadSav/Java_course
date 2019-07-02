
import java.util.Comparator;

public class ComparatorByMass implements Comparator <WildAnimals>{

	
	
	@Override
	public int compare(WildAnimals o1, WildAnimals o2) {
	
		return (int)(o1.getMass()-o2.getMass());
	}

}
