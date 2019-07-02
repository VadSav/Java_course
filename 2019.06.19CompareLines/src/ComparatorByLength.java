import java.util.Comparator;

public class ComparatorByLength implements Comparator <Lines>{ 
	
	@Override
	public int compare(Lines o1, Lines o2) {
		return o1.getLines().compareTo(o2.getLines());
		
	
	}
}
