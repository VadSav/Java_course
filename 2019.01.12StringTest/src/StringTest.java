
public class StringTest {

	public static void main(String[] args) {
		String str1="Hello";
		String  str2= new String ("Hello");
		boolean res =str1==str2;
		System.out.println(res);

		
	String str3 =new String ("Hello");
	boolean res1=str2== str3 ;
	System.out.println(res1);
	
	boolean res2=str1.contentEquals(str2);
	System.out.println(res2);
	
	
	boolean res3=str2.contentEquals(str3);
	System.out.println(res3);
	
	String str4="hello world";
	String str5="Hello world";;
	boolean res5=str4.contentEquals(str5);
	boolean res4=str4.contentEquals(str5);
	System.out.println(res5);
	String str6=str4.toUpperCase();
	System.out.println(str6);
	String str7=str6.toLowerCase();
	System.out.println(str7);
	}

}
