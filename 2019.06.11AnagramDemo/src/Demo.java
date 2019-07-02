import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Annagramms {
	
	
	private static Map<String, List<String>> voc = new HashMap<> ();
	public static List <String>list =  Arrays.asList("ivan","navi","vani","anna","naan");
	
		
	public static List<String> isAnagramm(String word) {
	
	String s= sortWord(word);
	return voc.get(s);

}
public static void createVoc() {
	for (String s : list) {
		
	}
}
public static String sortWord(String s) {
	char[] chars = s.toCharArray();
	Arrays.parallelSort(chars);
	return new String (chars);
	
}
 public static Map<Object, List<String>> createDict; 
 public static void main(String[] args) {
	createVoc ();
	
	List<String> ivan = isAnagramm("ivan");
	String test = alphabetize("ivan");
	System.out.println(test);

	List<String> anna =isAnagramm ("anna");
	String test1 = alphabetize("anna");
	System.out.println(test1);
	
	
	
	
	String[] dict;
	createDict = createDict(dict);
	
	createDict.forEach((k, v) -> System.out.println(k +" "+ v));
	
	List<String> findAnagrams = findAnagrams("ivan");
	System.out.println(findAnagrams);
	List<String> findAnagrams1 = findAnagrams("anna");
	System.out.println(findAnagrams1);
}

 public static Map<Object, List<String>> createDict(String [] voc) {		
		return Arrays.asList(voc)
		.stream()
		.collect(Collectors.groupingBy(s -> Anagramms.alphabetize(s)));
	}



	public static String alphabetize(String input) {
		char[] charArray = input.toCharArray();
		Arrays.sort(charArray);
		return new String(charArray);
	}

	public static List<String> findAnagrams(String word) {
		String alphabetize = alphabetize(word);
		Map<String, List<String>> createDict;
		return createDict.get(alphabetize);
	}
}

