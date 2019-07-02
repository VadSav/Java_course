package telran.animals.emtity;

public class Dog extends Animal {
	private int smellLevel;

	public Dog(int lenght, int height, int age, String name, int smellLevel) {
		super(lenght, height, age, name);
		this.smellLevel = smellLevel;
	}

	public int getSmellLevel() {
		return smellLevel;
	}

	public void setSmellLevel(int smellLevel) {
		this.smellLevel = smellLevel;
	}

	public String toString() {
		return "Dog [smellLevel=" + smellLevel + ", toString()="
				+ super.toString() + "]";
	}

	public void voice() {
		System.out.println("Hav-Hav");
		
	}

	public void moving() {
		System.out.println(50);
		
	}
	
	

}
