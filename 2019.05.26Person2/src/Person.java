
public class Person {
	private String Name;
	private int age;
	
	public Person(String lastName, String firstName, int age) {
		super();
		this.Name = lastName;
		this.age = age;
		
	}

	public String getName() {
		return Name;
	
	}
	public int getAge() {
		return age;
	}

	public Person(String name, int age) {
		super();
		Name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [Name=" + Name + ", age=" + age + "]";
	}

}
