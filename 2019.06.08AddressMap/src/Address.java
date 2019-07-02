
public class Address {
	String street;
	int houseNumber;
	public Address(String street, int housetnumber) {
		super();
		this.street = street;
		this.houseNumber = housetnumber;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", houseNumber=" + houseNumber + "]";
	}

}
