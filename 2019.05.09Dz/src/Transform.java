
public class Transform {
	
	// a0bb00cde ->000abbcde
	//12345600 -> 00123456
	public static String transform(String input){
		StringBuilder zeros =new StringBuilder();
		StringBuilder others =new StringBuilder();
	for (int i=0 ;i<input.length(); i++) {
	//zeros.append (input.charAt(i));
		
		System.out.println(input.charAt(i));

	}
	return zeros.append(others).toString();

		}

}