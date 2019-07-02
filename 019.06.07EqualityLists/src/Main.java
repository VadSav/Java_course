import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> aList = new ArrayList<>();
		ArrayList<Integer> bList = new ArrayList<>();

		aList.add(10);
		aList.add(25);
		aList.add(230);
		aList.add(75);
		aList.add(91);
		aList.add(2);
		
		bList.add(10);
		bList.add(25);
		bList.add(115);
		bList.add(75);
		bList.add(91);
		bList.add(1);
		
		
			for (int i = 0; i < aList.size(); i++) {
				if(aList.get(i)==bList.get(i)) {
				System.out.println("Yes");
				}else {
					System.out.println("No");
				}
		}
	}
		

	}


