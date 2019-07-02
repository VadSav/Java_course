package telran.airport;

public class Pilots {

    private String name;

	public Pilots(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Pilots [name=" + name + "]";
	}
    
    
    
}
