package telran.animals.emtity;

public class Sheep extends Animal {
	private int hairiness;
	
	
	
	public Sheep(int lenght, int height, int age, String name, int hairiness) {
		super(lenght, height, age, name);
		this.hairiness = hairiness;
	}
	
	

	public int getHairiness() {
		return hairiness;
	}



	public void setHairiness(int hairiness) {
		this.hairiness = hairiness;
	}

	

	public String toString() {
		return "Sheep [hairiness=" + hairiness + ", toString()="
				+ super.toString() + "]";
	}



	public void voice() {
		System.out.println("beee - beee");
		// TODO Auto-generated method stub

	}

	public void moving() {
		System.out.println(15);
		// TODO Auto-generated method stub

	}

}
