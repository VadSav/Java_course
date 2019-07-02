
public class Transformer {
	
	public static String transform(String input, WordsTransformer t) {
		if(input == null || input.length() == 0) {
			System.out.println("Invalid string");
			return null;
		}
		String[] words = input.split(" ");		
		for (int i = 0; i < words.length; i++) {			
			if(t.check(words[i])){
				words[i] = t.transform(words[i]);				
			}		
		}
		return String.join(" ", words);
	}

}
