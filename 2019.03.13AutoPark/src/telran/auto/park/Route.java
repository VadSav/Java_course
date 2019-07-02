package telran.auto.park;

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
    
    
    
    

}

