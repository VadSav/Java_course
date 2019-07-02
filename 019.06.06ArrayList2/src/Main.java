
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String>List = new ArrayList<>();
		List.add("Ivan");
	    List.add("Piotr");
	    System.out.println(List);

	
	ArrayList<String> List1 = getList("Ivan","Piotr");
    System.out.println(List1);
    
    String s =List1.get(1);
    System.out.println(s);
	}
	public static ArrayList<String> getList(String s1,String s2) {
		ArrayList List = new ArrayList();
		List.add(s1);
		List.add(s2);
		return List;
		
		
	}

}
