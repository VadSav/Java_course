

public class Route {
    private String startPoint;
    private String endPoint;
    private int distance;
    
    
    public Route(String startPoint, String endPoint, int distance) {
	this.startPoint = startPoint;
	this.endPoint = endPoint;
	this.distance = distance;
    }
    
    public Route( String endPoint, int distance) {
	this.startPoint = "Berlin";
	this.endPoint = endPoint;
	this.distance = distance;
    }

    @Override
    public String toString() {
	return "[from " + startPoint + " to " + endPoint + " (" + distance + "km )]";
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + distance;
	result = prime * result + ((endPoint == null) ? 0 : endPoint.hashCode());
	result = prime * result + ((startPoint == null) ? 0 : startPoint.hashCode());
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
	Route other = (Route) obj;
	if (distance != other.distance)
	    return false;
	if (endPoint == null) {
	    if (other.endPoint != null)
		return false;
	} else if (!endPoint.equals(other.endPoint))
	    return false;
	if (startPoint == null) {
	    if (other.startPoint != null)
		return false;
	} else if (!startPoint.equals(other.startPoint))
	    return false;
	return true;
    }
    
    
    
    

}
