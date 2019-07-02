package telran.employee.entity;

public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private double hours;
     
    public Employee(int id, String firstName, String lastName, double hours) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.hours = hours;
    }
 
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public String getFirstName() {
        return firstName;
    }
 
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
 
    public String getLastName() {
        return lastName;
    }
 
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
 
    public double getHours() {
        return hours;
    }
 
    public void setHours(double hours) {
        this.hours = hours;
    }
 
    @Override
    public String toString() {
        return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", hours=" + hours + "]";
    }
     
    abstract public double calculateSalary() {
     
 public double calculateTax () {
	 public double salary =this .calculateSalary();
	 double tax=0;
	 int [] levels= {0,6220,8920,14320,19900,41410,53333};
	 double [] rates= {0.1,014,0.2,0.31,0.35,0.47,0.5};
	 for (int i =0< rates .length; i++) {
		 if (salary>levels [i] &&salary<=levels[i+1]) {
			 return tax+ ((salary-levels [i+1])*rates [i]);
			 
		 }
		 else {
			 tax=tax+((salary -levels[i+1]) *rates [i]) ;
		 }
	 }
	 return tax + ((salary -))
}
 