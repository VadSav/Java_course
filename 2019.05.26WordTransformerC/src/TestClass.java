
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestClass {
    public static void main(String[] args) {
    	//String [] strings = {"sRhf,","vUzten","aejkl","Dtekn","Mazuh","Rwhnbm","eipkm"};
    	//Arrays.sort(strings);
    	
        ArrayList<String> listStrings = new ArrayList<String>(Arrays.asList("sRhf,","vUzten","aejkl","Dtekn","Mazuh","Rwhnbm","eipkm"));
        System.out.println("Source list: "+listStrings);
        Collections.sort(listStrings);
        System.out.println("Sorted list, in that order " + listStrings);
        Collections.sort(listStrings, Collections.reverseOrder());
        System.out.println("Sorted list in reverse order"+listStrings);
 
    }
}