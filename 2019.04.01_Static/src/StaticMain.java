
public class StaticMain {
    
    
    
    public static void main(String[] args) {
	 StaticTest st = new StaticTest(1,"1");
	 StaticTest st2 = new StaticTest(2,"2");
	 
	 st.param3="1";
	 st2.param3="2";
	 
	 
	 System.out.println(st.param3);
	 st2.param3="priv";
	 System.out.println(st.param3);
	 
	 
    }
}
