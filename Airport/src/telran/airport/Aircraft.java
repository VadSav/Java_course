package telran.airport;

public class Aircraft {
	private String type ;
	private int number;
	
	
	
	public Aircraft(String type, int number) {
		super();
		this.type = type;
		this.number = number;
	}
	public String getType() {
		return type;
	}

	public int getNumber() {
		return number;
	}
	@Override
	public String toString() {
		return "Aircraft [type=" + type + ", number=" + number + "]";
	}
	
	
	



	

}
