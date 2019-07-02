import java.util.ArrayList;

public class People {

	public static void main(String[] args) {
		
		   ArrayList<String> myArrayList = new ArrayList<String>();
		   myArrayList.add("Alex");
		   myArrayList.add("Ivan");
		   myArrayList.add("Teodor");
		   myArrayList.add("Gogi");
		   System.out.println(myArrayList.toString());

		   myArrayList.remove("Teodor");
			  System.out.println(myArrayList.toString());
			
		   myArrayList.add("Denis");
			
			  System.out.println(myArrayList.toString());
			
			  System.out.println(myArrayList.size());
		   myArrayList.clear();
			  System.out.println(myArrayList.toString());

		}
	}
