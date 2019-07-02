package telran.airport;

public class MainAirport {

	public static void main(String[] args) {
	
		MainAirport  airport = new MainAirport() ;
		
		Aircraft a1 = new Aircraft("B777", 17);
		Aircraft a2 = new Aircraft("A276", 23);
		Aircraft a3 = new Aircraft("C177", 34);
		Flight f1 = new Flight("Berlin Moscow",2);
		Flight f2 = new Flight("Berlin Bonn",1);
		Flight f3 = new Flight("Berlin Stutgart",1);
		Pilots p1 = new Pilots("Ivan Ivanov");
		Pilots p2 = new Pilots("Peter Danov");
		Pilots p3 = new Pilots("Kurt Minen");
		Passengers ps1 = new Passengers ("Kint Malou");
		Passengers ps2 = new Passengers ("Villi  Boter");
		Passengers ps3 = new Passengers ("Sergey Mafin");
		
	}	
		


	
	
}

