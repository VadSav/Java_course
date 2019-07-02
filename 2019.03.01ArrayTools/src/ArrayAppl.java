
public class ArrayAppl {

	public static void main(String[] args) {
	
		int arr []= {1,4,8,10,12,17};
		ArrayTools.printArray(arr);
		int arr2 [] = {34,45,57,76,89,90,34,73,123,435 };
		ArrayTools.printArray(arr2);
		
		int len1=arr.length ;
		System.out.println(len1);
		int len2=arr.length ;
		System.out.println(len2);
		
		int arr3[]= new int[10];
		ArrayTools.fillArray(arr3, -100, 100);
		ArrayTools.printArray(arr3);
	}

}
