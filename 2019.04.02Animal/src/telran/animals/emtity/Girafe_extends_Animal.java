package telran.animals.emtity;

public class Girafe extends Animal {
	private int neckLenght;

	public Girafe(int lenght, int height, int age, String name, int neckLenght) {
		super(lenght, height, age, name);
		this.neckLenght = neckLenght;
	}

	public int getNeckLenght() {
		return neckLenght;
	}

	public void setNeckLenght(int neckLenght) {
		this.neckLenght = neckLenght;
	}

	public String toString() {
		return "Girafe [neckLenght=" + neckLenght + ", toString()="
				+ super.toString() + "]";
	}

	public void voice() {
		System.out.println("ffff");

	}

	public void moving() {
		System.out.println(10);
		// TODO Auto-generated method stub

	}

	
	
}

