
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		
		 List<Integer> list1  = Arrays.asList(1,2,3,5);
		 List<Integer> list2  = Arrays.asList(1,4,3,0);
		 
		 System.out.println(compareLists(list1, list2));
	 
	}

	public static List<String> compareLists(List<Integer> list1, List<Integer> list2) {
		
		List<String> ret = new ArrayList<>();

    	for (int i = 0; i < list1.size(); i++) {
    		if(list1.get(i).equals(list2.get(i)) ){
    			
    			ret.add("Yes");
	    	}
	    	else{
	    		ret.add("No");
	    	}
	    }
    	
    	return ret;
    	
    
    }        	
		
}

	


				
			
	


		        
    		    
        	




        	
	


			      

	


			