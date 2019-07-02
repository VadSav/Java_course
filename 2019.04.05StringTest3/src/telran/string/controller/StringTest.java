package telran.string.controller;

public class StringTest {

	public static void main(String[] args) {
		char c = '5' ;
boolean check = false ;
if (Character.isDigit(c)) {
	check = true ;

}
System.out.println(check);

String str = new String ("Hello");
char [] chars = { ' ', 'w', 'o' ,'r', 'l' ,'d' } ;
String str1 = new String(chars) ;
System.out.println(str1);

str = str +str1 ;
System.out.println(str);
System.out.println(str.length());

for (int i = 0; i < chars.length; i++) {
	System.out.println(str.charAt(i));
	
}
String str2 = " WORLD" ;
System.out.println(str2.equals(str1));
System.out.println(str2.equalsIgnoreCase(str1));
System.out.println(str2.indexOf("LD"));
 
System.out.println(str2.toLowerCase());

System.out.println(str2.lastIndexOf('W'));

String str4 = str.replace("ell", "ZZZ") ;
System.out.println(str4);


	}

}
