
public class Astr {

	

	public static void main(String[]agr) {

  
String s="aaa BCde eKL MnoP ";
  
        
        System.out.println("aaa BCde eKL MnoP");
      
		String input = s.toLowerCase();
        
        int count = 0;

        
        if(input.length() != 0){
            count++;
            
            for (int i = 0; i < input.length(); i++) {
                if(input.charAt(i) == ' '){
                    
                    count++;
                }
            }
        }

        System.out.println("You entered "+count+ "words'");
    }
}
	