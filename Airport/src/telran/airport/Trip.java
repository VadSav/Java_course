package telran.airport;

public class Trip {

	Aircraft aircraft ;
	 Pilots pilots ;
	Passengers passangers ;
	Flight flight ;
	
	public Trip(Aircraft aircraft, Pilots pilots, Passengers passangers, Flight flight) {
		super();
		this.aircraft = aircraft;
		this.pilots = pilots;
		this.passangers = passangers;
		this.flight = flight;
	}

	@Override
	public String toString() {
		return "Trip [aircraft=" + aircraft + ", pilots=" + pilots + ", passangers=" + passangers + ", flight=" + flight
				+ "]";
	}
	
	
	    
}
