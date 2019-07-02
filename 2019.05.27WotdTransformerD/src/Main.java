import java.util.Arrays;
import java.util.Comparator;

public class Main {


	private static Comparator<Word> comp;
	public static void main(String[] args) {
		Word w1= new Word ("Fhjk");
		Word w2= new Word (" BCde");
		Word w3= new Word ("eKL");
		Word w4= new Word (" MnoP");
		Word w5= new Word ("aaa");
		
		Word word[]= { w1,w2,w3,w4,w5};
	Arrays.sort(args);
		
		for (int i = 0; i < word.length; i++) {
            System.out.println(word[i]);
        }

		
		Arrays.sort(word, comp.thenComparing(new ComparatorByName()));
        for (int i = 0; i < word.length; i++) {
            System.out.println(word[i]);
        }
	}
        public  static void temp(String str){

	}

	}

