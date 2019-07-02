package telran.animals.emtity;



public class Cat extends Animal {
	private int ScratchLevel;
	
	
	public Cat(int lenght, int height, int age, String name, int scratchLevel) {
		super(lenght, height, age, name);
		ScratchLevel = scratchLevel;
	}

	
	public int getScratchLevel() {
		return ScratchLevel;
	}


	public void setScratchLevel(int scratchLevel) {
		ScratchLevel = scratchLevel;
	}
	
	

	public String toString() {
		return "Cat [ScratchLevel=" + ScratchLevel + ", toString()="
				+ super.toString() + "]";
	}


	public void voice() {
		System.out.println("Myau - Myau");
		// TODO Auto-generated method stub

	}

	public void moving() {
		System.out.println(25);
		// TODO Auto-generated method stub

	}

}
