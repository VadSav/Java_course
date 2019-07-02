
public class Test {

	public static void main(String[] args) {
		String string ="Ivan";
		String string3 = "Ivan";
		String string2 =new String("Ivan");
System.out.println(string == string3);

System.out.println(string.contentEquals(string2));

String helloWorld = "Hello";
helloWorld = helloWorld + "World";
System.out.println(helloWorld);

StringBuilder sb = new StringBuilder ("Hei");
sb.append("a");
System.out.println(sb);

String a0bb00cde = transform("a0bb00cde");
		System.out.println(a0bb00cde);
		
	}
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
//"abcde", "eabcd" -> true
//"bbcda", "dabbc" ->true
//"abcde" ,"edac" ->true
//"a","a" ->true
//"abc", " cab" ->true
public static boolean isCircular(String s1,String s2){
	return false ;
}

}

