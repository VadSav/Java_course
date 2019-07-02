import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MainList {
	public static void main(String[] args) {
		
	 List<String> list1  = Arrays.asList("aa","bb","cc","ff");
	 List<String> list2  = Arrays.asList("bb","cc","dd","aa");
	 
	 System.out.println(isCircular(list1,list2));
	 
	 
	}
		 
	static boolean  isCircular(List<String> list1,List<String> list2) {
			if(list1.size() !=list2.size()) {				
				return false ;
			}
			List<String> tmp = new ArrayList<>(list1);
			
			for (int i = 0; i < list1.size(); i++){
				String last = tmp.remove(tmp.size()-1);
				tmp.add(0, last);
				
				System.out.println(tmp);
				if(tmp.equals(list2)){					
					return true ;					
				}			
			}
			return false;
	  }

}