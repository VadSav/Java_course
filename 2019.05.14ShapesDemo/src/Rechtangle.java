
public class Rechtangle extends Shape {
	private double sideA;
	private double sideB;
	public Rechtangle(String name,double sideB,double sideA){
	super(name);
	this.sideA = sideA;
	this.sideB = sideB;

}
@Override
public double calculateShape() {
	return sideA*sideB;
}
}