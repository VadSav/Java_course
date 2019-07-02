
public class Bus {
    private String number;
    private int capacity;

    
    public Bus(String number, int capacity) {
	this.number = number;
	this.capacity = capacity;
    }

    public String getNumber() {
        return number;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
	return "Bus " + number;
    }
    
    public Trip doTrip(Route route, Driver driver) {	
	return new Trip(this, route, driver);
    }
    
    
    
    
    

}
