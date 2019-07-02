import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainReverse {

	

	public static void main(String[] args) {
		
		 List<Integer> list  = Arrays.asList(1,2,3,4,5);
		 
		 for (int i = list.size() - 1; i >= 0; i--) {
			 System.out.println(list.get(i));
		 }
		
		 
		 List<Integer> reverse = reverse( list);
		 System.out.println(reverse);
	
	}
	
	public static List<Integer> reverse(List<Integer> list) {
		List<Integer> ret = new ArrayList<>();
		 for (int i = list.size() - 1; i >= 0; i--) {
			 ret.add(list.get(i));
		 }
		return ret;
    }

}



