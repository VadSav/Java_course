
public class ArrayTools {

	public static void  fillArray(int arr [], int min ,int max ) {
	for (int i = 0; i < arr.length; i++) {
		arr[i] = min+(int)(Math.random() * (max-min+1));
	}
		
}
	
	public static void printArray(Person  arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] .dysplay());
			
		}
		System.out.println();
	}
}