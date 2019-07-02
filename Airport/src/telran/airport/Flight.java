package telran.airport;

public class Flight {

    private String startPoint;
    private String endPoint;
    private int distanceTime;
    
    
    
	public Flight(String startPoint, String endPoint, int distanceTime, int number) {
		super();
		this.startPoint = startPoint;
		this.endPoint = endPoint;
		this.distanceTime = distanceTime;
		
	}


	  public Flight ( String endPoint, int distanceTime) {
			this.startPoint = "Berlin";
			this.endPoint = endPoint;
			this.distanceTime = distanceTime;
		    }

	@Override
	public String toString() {
		return "Flight [startPoint=" + startPoint + ", endPoint=" + endPoint + ", distanceTime=" + distanceTime
				+  "]";
	}
    
    
}
