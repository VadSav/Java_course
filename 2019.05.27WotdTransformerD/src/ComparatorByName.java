

import java.util.Comparator;

public class ComparatorByName implements Comparator <Word>{

	
		
		

	@Override
	public int compare(Word o1, Word o2) {
		return o1.getName().compareTo(o2.getName());
		
	}


}
