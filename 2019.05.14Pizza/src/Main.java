

public class Main {

	public static void main(String[] args) {
		
		PizzaFactory factory =new PizzaFactory();
		
		Pizza pizza =factory.createPizza(PizzaType.PIZZA_SALAMI);
		Pizza pizza1 =factory.createPizza(PizzaType.PIZZA_MOZARELLA);
		Pizza pizza2 =factory.createPizza(PizzaType.PIZZA_HAWAI);
		
		
		pizza. orderPizza();
		pizza1. orderPizza();
		pizza2. orderPizza();
		
		
		PizzaType[] values= PizzaType.values();
		for(PizzaType t:values) {
			System.out.println(t);
		}
		 PizzaType pizza_salami = PizzaType.valueOf("PIZZA_SALAMI");
		 System.out.println("Pizza salami:" +pizza_salami);
//System.out.println("Total pizzas baked :"+factory.getCounter());
	}
	

	}


// pattern : Template Method

// pattern  : Factory

//DZ  sdelati funkciyu ,prinimaet deni nedeli , vozvraschaet  vyhodnoi  ili net  metodom  switch _ return _false
//Scanner s= new Scanner(System in);
//String str =s.readString();
// boolean is DayOff(DayOffWeek day)
