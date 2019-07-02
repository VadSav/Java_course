
import java.util.Arrays;
import java.util.Comparator;

public class MainAnimals {



	private static String name;


	public static void main(String[] args) {
		
		WildAnimals wl1= new WildAnimals("gray" , 800);
		WildAnimals wl2 = new WildAnimals("brown",650);
		WildAnimals wl3 = new WildAnimals("black",180);
		
		Pets p1 = new Pets("white",30,"Tuzik");
		Pets p2 = new Pets("yellow",2,"Murka");
		Pets p3 = new Pets("pink",110,"Hryusha");
		WildAnimals wildanimals[]= {wl1,wl2,wl3,p1,p2,p3};
		
		Arrays.sort(args);
		
		for (int i = 0; i < wildanimals.length; i++) {
            System.out.println(wildanimals[i]);
        }
		 System.out.println("*****************************************");
		 Comparator<WildAnimals> comp = new ComparatorByMass();
	        Arrays.sort(wildanimals, comp.thenComparing(new ComparatorByMass()));
	        

	        for (int i = 0; i < wildanimals.length; i++) {
	            System.out.println(wildanimals[i]);
	        }
	        System.out.println("****************************************");
	        
	        Arrays.sort(wildanimals, comp.thenComparing(new ComparatorByColor()));
	        for (int i = 0; i < wildanimals.length; i++) {
	            System.out.println(wildanimals[i]);
	        }

	        System.out.println("****************************************");

	
}
      

    public  static void temp(String str){

        

}
}