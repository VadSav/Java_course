import java.util.List;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
	
	public static void main(String[] args) {
		
		  List list  = Arrays.asList("Ivan","Maria","Stephan","John","Amalia");
		
		List strings=filterNames(list);
		  System.out.println(strings);
	
		
			
		}
	
	public static List<String> filterNames(List<String> list){
		List<String> tmp =new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).length()!=4) {
				tmp.add(list.get(i));
				
			}
			
		}
		
		return tmp;
	}

}
		   
	

