package telran.computers.entity;

public class Laptop extends computer {
private int weigt;
private int hours;



public Laptop(int ram, int hdd, String cpu, String brand, int weigt, int hours) {
	super(ram, hdd, cpu, brand);
	this.weigt = weigt;
	this.hours = hours;
}



public int getWeigt() {
	return weigt;
}



public void setWeigt(int weigt) {
	this.weigt = weigt;
}



public int getHours() {
	return hours;
}



public void setHours(int hours) {
	this.hours = hours;
}



@Override
public String toString() {
	return "Laptop [weigt=" + weigt + ", hours=" + hours + ", toString()=" + super.toString() + "]";
}



@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + hours;
	result = prime * result + weigt;
	return result;
}



@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!super.equals(obj))
		return false;
	if (getClass() != obj.getClass())
		return false;
	Laptop other = (Laptop) obj;
	if (hours != other.hours)
		return false;
	if (weigt != other.weigt)
		return false;
	return true;
}


}






