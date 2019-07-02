



public class WildAnimals{
	
	private String color;
	private int mass;
	
	

	public WildAnimals(String color, int mass) {
		super();
		this.color = color;
		this.mass = mass;
	}


	public String getColor() {
		return color;
	}


	public int getMass() {
		return mass;
	}


	 public int compareTo(WildAnimals arg) {
	        return this.mass - arg.mass;
	    }

	    @Override
	    public String toString() {
	        return "[color=" + color + ", mass=" +mass + "]";

	}

}
	
	
