

public class Demo {
//        s1            s2
//   [][][adr hello ][][adr hello][][][].........{[hello][hello1][][][][]}
//    
    public static void main(String[] args) {
	String s1= "hello";
	String s2 = "hello";
	String s3 = new String("hello");
	
	char[] cArray = {'h','e','l','l','o'};
	String s4 = new String(cArray);
	
	System.out.println("s1==s2 " + (s1==s2));
	System.out.println("s1.equals(s2) " + (s1.equals(s2)));
	System.out.println();
	System.out.println("s1==s3 " + (s1==s3));
	System.out.println("s1.equals(s3) " + (s1.equals(s3)));
	
	System.out.println();
	System.out.println("s2=s3");
	s2=s3;
	System.out.println("s2==s3 " + (s2==s3));
	System.out.println("s2.equals(s3) " + (s2.equals(s3)));
	
	System.out.println("s1==s2 " + (s1==s2));
	System.out.println("s1.equals(s2) " + (s1.equals(s2)));
	
	s2 = "hello1";
	System.out.println(s2);
	int a=7;
	s2=String.format("value int is %d",a );
	
	StringBuffer st= new StringBuffer(s2);
	
	st.toString();
    }

}
