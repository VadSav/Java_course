

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

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + capacity;
	result = prime * result + ((number == null) ? 0 : number.hashCode());
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
	Bus other = (Bus) obj;
	if (capacity != other.capacity)
	    return false;
	if (number == null) {
	    if (other.number != null)
		return false;
	} else if (!number.equals(other.number))
	    return false;
	return true;
    }
    
    
    
    
    

}

