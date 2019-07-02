
public class Pets extends WildAnimals  {
private String name;

public Pets(String color, int mass, String name) {
	super(color, mass);
	this.name = name;
}

public String getName() {
	return name;
	
}
@Override
public String toString() {
    return "[name=" + name + "]";
}



}
