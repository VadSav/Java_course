
public class Main {
	public static void main(String[] args) {
		System.out.println("aaa BCdE eKl MnjhsjdhoP asirt");
		System.out.println(Transformer.transform("aaa BCdE eKl MnjhsjdhoP asirt", new ToLowerCaseTransformer()));
		System.out.println(Transformer.transform("aaa BCdE eKl MnjhsjdhoP asirt", new ToUpperCaseTransformer()));
		System.out.println(Transformer.transform("aaa BCdE eKl MnjhsjdhoP asirt", new ToAsteriskTransformer()));		
	}	
}
