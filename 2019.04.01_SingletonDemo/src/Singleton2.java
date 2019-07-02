
public class Singleton2 {
    public static Singleton2 Instance = null;
    public int test;
    
    private Singleton2() {System.out.println("Singleton2 created");}
    
    public static  Singleton2 getInstance() {
	if(Instance == null) Instance = new Singleton2();
	return Instance;
    }
    
    public static void main(String[] args) {
	System.out.println("Start");
	
	Singleton2 obj1= Singleton2.getInstance();
	Singleton2 obj2= Singleton2.getInstance();
	
	obj1.test=1;
	obj2.test=2;
	
	System.out.println(obj1.test);
    }

}
