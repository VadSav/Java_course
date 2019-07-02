
public class Trip {
    Bus bus;
    Route route;
    Driver driver;
    
    @Override
    public String toString() {
	return bus + ":" + route + " driver=" + driver;
    }

    public Trip(Bus bus, Route route, Driver driver) {
	super();
	this.bus = bus;
	this.route = route;
	this.driver = driver;
    }
    
    
}
