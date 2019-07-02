

public class Trip {
    private static int counter=0;
    public  final int id;
    Bus bus;
    Route route;
    Driver driver;
    
    @Override
    public String toString() {
	return "Trip -" + id +" " + bus + ":" + route + " driver=" + driver;
    }

    public Trip(Bus bus, Route route, Driver driver) {
	super();
	id = ++counter;
	this.bus = bus;
	this.route = route;
	this.driver = driver;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((bus == null) ? 0 : bus.hashCode());
	result = prime * result + ((driver == null) ? 0 : driver.hashCode());
	result = prime * result + ((route == null) ? 0 : route.hashCode());
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Trip other = (Trip) obj;
	if (bus == null) {
	    if (other.bus != null)
		return false;
	} else if (!bus.equals(other.bus))
	    return false;
	if (driver == null) {
	    if (other.driver != null)
		return false;
	} else if (!driver.equals(other.driver))
	    return false;
	if (route == null) {
	    if (other.route != null)
		return false;
	} else if (!route.equals(other.route))
	    return false;
	return true;
    }
    
    
}
