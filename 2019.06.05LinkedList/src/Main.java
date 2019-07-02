import java.util.LinkedList;

public class Main {
	

		   public static void main(String[] args) {

		       String str1 = new String("A");
		       String str2 = new String("B");
		       String str3 = new String("C");
		       String str4 = new String("D");
		       
		     LinkedList<String> letters = new LinkedList<>();
		       
		       letters.add(str1);
		       letters.add(str2);
		       letters.add(str3);
		       letters.add(str4);
		      
		    System.out.println(letters);
		    System.out.println(letters.size());
		     
		     letters.addFirst(str4);
		     letters.addLast(str2);
		     
		    System.out.println(letters.peekFirst());
		    System.out.println(letters.peekLast());
		       
		       letters.add(str1);
		       letters.add(str2);
		       letters.add(1, str3);

		    System.out.println(letters);
		    System.out.println(letters.size());
		    letters.removeFirst();
		    letters.removeLast ();
		    System.out.println(letters);
		   }
		}


