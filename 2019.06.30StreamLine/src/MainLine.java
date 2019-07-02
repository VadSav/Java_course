

public class MainLine {
	
	public static void main(String[] args) {
		
		String text = "dru rtz sget absd nrtj awqs ctru ayxnmcjk";

		String prefix = "a";
		int count = 0;
		int currentIndex = 0;
		while (currentIndex < text.length() 
		       && (currentIndex = (text.indexOf(prefix, currentIndex) + 1)) != 0)
		    count++;

		if(text.startsWith(prefix.trim()))
		    count++;

		System.out.println(count);
		
	}

}
