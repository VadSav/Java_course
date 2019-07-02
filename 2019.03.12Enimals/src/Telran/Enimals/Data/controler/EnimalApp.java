package Telran.Enimals.Data.controler;

import Telran.Enimals.Data.ArrayTools;
import Telran.Enimals.Data.Enimal;

public class EnimalApp {

	public static void main(String[] args) {
		Enimal a1=new Enimal("Sharik", "dog"," Dyadya Fedor", 1977, false);
		Enimal a2 =new Enimal("Bobik", "pig", 1999, true);
		Enimal a3 =new Enimal("horse", 2005, false);
		
Enimal arr[] = {a1,a2,a3};
ArrayTools.printArray(arr);

}
}