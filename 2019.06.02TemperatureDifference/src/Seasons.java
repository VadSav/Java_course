
public class Seasons {
	public String name;
	public int max;
	public int min;
	
	public Seasons(String name, int max, int min) {
		super();
		this.name = name;
		this.max = max;
		this.min = min;
	}
	public String getName() {
		return name;
	}
	public int getMax() {
		return max;
	}
	public int getMin() {
		return min;
	}
	@Override
	public String toString() {
		return "Seasons [name=" + name + ", max=" + max + ", min=" + min + "]";
	}
	

	}

		
	