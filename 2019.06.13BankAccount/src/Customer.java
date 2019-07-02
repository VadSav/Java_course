


public class Customer {
	String FirstName;
	String LastName;
	public Customer(String firstName, String lastName) {
		super();
		FirstName = firstName;
		LastName = lastName;
	}
	public String getFirstName() {
		return FirstName;
	}
	public String getLastName() {
		return LastName;
	}
	@Override
	public String toString() {
		return "Customer [FirstName=" + FirstName + ", LastName=" + LastName + "]";
	}
	
	

}
