import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


public class Demo {

	public static void main(String[] args) {
		
		FunctionalNumbers f =(a,b)->  a+b;
		System.out.println(f.count(5, 3));
		
	    BiFunction<String,String,String> s   =(a,b)-> (a+b);
		String result = s.apply("51","33");
		System.out.println(result);
		
		Predicate<String>  p = x -> x.length()==3; 
		//p.test("asrzu");
		System.out.println(p.test("rad"));
	
		
	
	}

	
}
