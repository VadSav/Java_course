
public class BankAccount {
	String IBAN;
	Person owner;
	public BankAccount(String iBAN, Person owner) {
		super();
		IBAN = iBAN;
		this.owner = owner;
	}
	public String getIBAN() {
		return IBAN;
	}
	public Person getOwner() {
		return owner;
	}
	@Override
	public String toString() {
		return "BankAccount [IBAN=" + IBAN + ", owner=" + owner + "]";
	}
	
	

}
