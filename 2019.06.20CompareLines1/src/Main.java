
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.Predicate;


public class Main {

	public static void main(String[] args) {
		String[] srings = {"not"," in"," money"," happiness"};
		

        Comparable<String> cr = new Comparable<String>() {
            @Override
            public int compareTo(String s) {
                return 0;
            }
        };

        Comparator<String> c = new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return Integer.compare(s.length(), t1.length());
            }
        };

        Comparator<String> cl = (String a, String b) -> {
            return Integer.compare(a.length(), b.length());
        };

        Comparator<String> cl2 = (a, b) -> {
            return Integer.compare(a.length(), b.length());
        };

        Comparator<String> cl3 = (a, b) -> Integer.compare(a.length(), b.length());

       
		Arrays.sort(strings, cl2);

        for(String s:strings) {
            System.out.println(s);
        }

        int [] values = {1, 2, 5, 6};
        Summarize s1 = b -> b;
        System.out.println("array sum "+sumAll(values, s1));

        Summarize s2 = a -> (a%2==0?a:0);
        System.out.println("array sum even "+sumAll(values, s2));


        BiFunction<String, String, Integer> ns = (a, b) -> a.length() + b.length();

        Integer result = ns.apply("aa", "ccc");
        System.out.println(result);

        Predicate<String> p = s -> s.length() == 3;

        p.test("asdasd");

    }

    public static int sumAll(int[] input, Summarize s) {
        int ret = 0;
        for(int a:input) {
            ret = ret + s.get(a);
        }
        return ret;
    }


}
