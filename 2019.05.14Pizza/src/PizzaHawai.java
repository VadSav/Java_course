
public class PizzaHawai extends Pizza{
	
	
	private static String TYPE = "Pizza Hawai";

	public PizzaHawai(){
		super(TYPE);
	}

	@Override
	public void prepare() {
		System.out.println("Preparing Pizza withn Hawai,Cheese,Tomato");
		
	}
	}


