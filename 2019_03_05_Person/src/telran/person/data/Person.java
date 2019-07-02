package telran.person.data;

public class Person {
private int id ;
private String firstName ;
private String lastName ;
private int age ;
private boolean sex;
public Person () {
	System.out.println("Shalom Construktor");
}
public Person (int id, String firstName ; String lastName ,int age , boolean sex)  {
this .id =id ;
this .

public int getId () {
	return id ;
	
}
public String getFirstName () {
return firstName ;
}
public String getLastName () {
	return lastName;
}
	public int getAge () {
		return age ;
		
	}
	public String getSex () {
		if (sex) {
			return "Man";
		
		}
		else {
	return 		"Women";
		}
	}
	
	
	public void setId(int id) {
		this. id= id ;
		public void setFirstName(String firstName) {
		this.firstName= firstName;
		
		
			
		}
		@Override
		public String toString() {
			return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
					+ ", sex=" + sex + "]";
		}
		public void setLastName(String lastName) {
				this .lastName=lastName;
				
		
		
	}
		public void setSex (boolean sex) {
			this.sex=sex ;
			
		}
		public void display () {
			
			System.out.println("ID :"+id);
			System.out.println("FN :"+firstName);
			System.out.println("LN :"+ lastName);
			System.out.println( "Age :" +age);
			System.out.println("Sex "+getSex());
		
		}
		public void greetings (String greetings ) {
			System.out.println(greetings+"   "+lastName);
		}
		public void greetings (String greetings ,int num) {
			System.out.println(greetings+"  "+ lastName+"  "+ num);
		}
}
