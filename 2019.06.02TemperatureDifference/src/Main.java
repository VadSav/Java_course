
public class Main {
     
	public static void  main(String[] args) {
	
		Seasons s1=	new Seasons("Winter",-3,-14);
		Seasons s2=new Seasons("Spring",7,-5);
		Seasons s3=new Seasons("Summer",42,8);
		Seasons s4=new Seasons("Autumn",8,3);
		
		System.out.println(s1.max-s1.min);
		System.out.println(s2.max-s2.min);
		System.out.println(s3.max-s3.min);
		System.out.println(s4.max-s4.min); 
		
		if (s1.max-s1.min > s2.max-s2.min && s1.max-s1.min >s3.max-s3.min &&s1.max-s1.min >s4.max-s4.min ) {
			System.out.println("Winter");
            
        } else if (s2.max-s2.min > s1.max-s1.min && s2.max-s2.min > s3.max-s3.min && s2.max-s2.min > s4.max-s4.min) {
            System.out.println("Spring");
        } else if (s3.max-s3.min > s1.max-s1.min && s3.max-s3.min > s2.max-s2.min && s3.max-s3.min > s4.max-s4.min) {
           System.out.println("Summer");
        } else if (s4.max-s4.min> s1.max-s1.min && s4.max-s4.min> s2.max-s2.min && s4.max-s4.min > s3.max-s3.min) {
            System.out.println("Autumn");
            
        }
        }
        public static Object addInt(int i) {
		
		return null;
	    }
		
}



		



	
	


