import java.util.Arrays;
import java.util.Comparator;

public class Demo {
	public static void main(String[] args) {
		Lines s1 = new Lines ("not in money happiness");
		Lines s2 = new Lines ("i love sports");
	
		Lines lines [] = {s1,s2};
		
		Arrays.sort(args);
	
		 Comparator<Lines> comp = new ComparatorByLength();
	        Arrays.sort(lines, comp.thenComparing(new ComparatorByLength()));
	        
	        for (int i = 0; i < lines.length; i++) {
	            System.out.println(lines[i]);
	        }
		System.out.println();
		
	        
	     }
	
		
	   Countable c2 =(s1,s2)-> s1>s2 ? s1:s2;
	   private Countable c;
	   int count = c.count(1,2);
	
	}



