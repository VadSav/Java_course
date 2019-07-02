package car;

public class telranCar {

	private String brand ;
	private String model;
	private int maxSpeed;
	private  int power;


public telranCar(String brand, String model, int maxSpeed, int power) {
	super();
	this.brand = brand;
	this.model = model;
	this.maxSpeed = maxSpeed;
	this.power = power;
}


public String getBrand() {
	return brand;
}


public void setBrand(String brand) {
	this.brand = brand;
}


public String getModel() {
	return model;
}


public void setModel(String model) {
	this.model = model;
}


public int getMaxSpeed() {
	return maxSpeed;
}


public void setMaxSpeed(int maxSpeed) {
	this.maxSpeed = maxSpeed;
}


public int getPower() {
	return power;
}


public void setPower(int power) {
	this.power = power;
}


@Override
public String toString() {
	return "telranCar [brand=" + brand + ", model=" + model + ", maxSpeed=" + maxSpeed + ", power=" + power + "]";
}
}

