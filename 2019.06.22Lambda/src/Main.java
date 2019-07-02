
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
    	
        String input = "aBc deFG klm OPrst";

        Predicate<String> p = s ->  s.length() == 3;

        Function<String, String> f = s -> s.toUpperCase();

        System.out.println(transform(input, p, f));
    }

    public static String transform(String sentence,
                                   Predicate<String> p,
                                   Function<String, String> f) {
        String [] words = sentence.split(" ");
        for(int i = 0; i < words.length; i ++) {
            if(p.test(words[i])) {
                words[i] = f.apply(words[i]);
            }
        }

        return String.join(" ", words);
    }
    
    public boolean isSomething(String a) {
        return a.length() == 1023;
        //very junior code below
//        if(a.length() ==1023) {
//            return true;
//        } else {
//            return false;
//        }
    }
   
    //even more junior code below
    public boolean checkSomething(boolean b) {
        if(String.valueOf(b).equals("false")){
            return false;
        } else {
            return true;
        }
        
    }
}