
public class PizzaFactory {
	  public static int COUNTER = 0;
	  
	public Pizza createPizza(PizzaType type) {
		
		switch (type) {
		case PIZZA_SALAMI: return new PizzaSalami();
		case PIZZA_MOZARELLA: return new PizzaMozarella();
		case PIZZA_HAWAI: return new PizzaHawai();
		}
		//if(name.equals("PIZZA_SALAMI")) {
		//	COUNTER++;
		//	return new PizzaSalami();
		//	if(name.equals("Pizza Mozarella")) {
			//	COUNTER++;
			//	return new PizzaMozarella();
				
		//}
		//	if(name.equals("Pizza Hawai")) {
			//	COUNTER++;
			//	return new PizzaHawai();
			//}
			return null;
			

}
	//public int getCounter() {
	//	return COUNTER ;
	}
