
public class Demo {



public static void main(String[] args) {
		String string ="Ivan";
		String string3 = "Ivan";
		String string2 =new String("Ivan");
System.out.println(string == string3);



System.out.println(string.contentEquals(string2));
System.out.println(transform("a0bb00cde"));

System.out.println(transformA("rghb00cde"));

String helloWorld = "Hello";
helloWorld = helloWorld + "World";
System.out.println(helloWorld);

StringBuilder sb = new StringBuilder ("Test");
sb.append("a");
System.out.println(sb);

String a0bb00cde = transform("a0bb00cde");

		System.out.println(a0bb00cde);
		
		System.out.println(isCircular("abcd", "dabc"));
		 
}
	
	
	
// a0bb00cde ->000abbcde
//12345600 -> 00123456
public static String transform(String input){
	StringBuilder zeros =new StringBuilder();
	StringBuilder others =new StringBuilder();
for (int i=0 ;i<input.length(); i++) {
//zeros.append (input.charAt(i));
	if(input.charAt(i)=='0') {
		zeros.append(input.charAt(i));
	
	}else {
		others.append(input.charAt(i));
	}
	
	System.out.println(input.charAt(i));

}
return zeros.append(others).toString();

	}
//"abcde", "eabcd" -> true
//"bbcda", "dabbc" ->true
//"abcde" ,"edac" ->true
//"a","a" ->true
//"abc", " cab" ->true
public static boolean isCircular(String s1,String s2){
	if(s1.length() !=s2.length()) {
	return false ;
	String tmp =s1;
	for (int i = 0; i < s1.length(); i++) {
		tmp =tmp.charAt(tmp.length()-1)+ tmp.substring(0,tmp.length()-1);
		System.out.println(tmp);
		if(tmp.equals(s2)) {
			return true ;
		}
	}
return false;
	}

}


public static int getLongestSubstring(String input) {
 int countLongestSubstring(String input) {
	return 0;
 }



public static String transformA(String input){
	String zeros = "";
	String others = "";
for (int i=0 ;i<input.length(); i++) {
	if(input.charAt(i)=='0') {
		zeros = zeros + input.charAt(i);
	
	}else {
		others = others + input.charAt(i);
	}
	
}

return zeros + others;

	}

public static void Circular() {
    StringBuilder stringBuilder = new StringBuilder("abcd");
    System.out.println("String :- " + stringBuilder);
   

    stringBuilder.deleteCharAt(0);

    System.out.println("After deletion :- " + stringBuilder);


}


}
