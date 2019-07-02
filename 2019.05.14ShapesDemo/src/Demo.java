
public class Demo {

	private static double PI = 3.14;
	public static void main(String[] args) {
		
Circle a = new Circle("test",10);
Rechtangle b= new Rechtangle("small",5 ,4);
System.out.println(a.calculateShape());
System.out.println(b.calculateShape());
System.out.println(a.toString());
System.out.println(b. toString());
	}

	public static double calculateCircleSquare(double r) {
		return PI*r*r;
		
	}

	public static double calculateCircleSquare(double a , double b) {
	return a*b;
}
}