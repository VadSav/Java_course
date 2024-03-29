
package telran.employee.data;

import telran.employee.StateConstants.StateConstants;

public class SalesManager extends Employee {
	
	private double salesVolume;
	private double percent;
	
	public SalesManager(int id, String firstName, String lastName, double hour, double salesVolume, double percent) {
		super(id, firstName, lastName, hour);
		this.salesVolume = salesVolume;
		this.percent = percent;
	}

	public double getSalesVolume() {
		return salesVolume;
	}

	public void setSalesVolume(double salesVolume) {
		this.salesVolume = salesVolume;
	}

	public double getPercent() {
		return percent;
	}

	public void setPercent(double percent) {
		this.percent = percent;
	}

	@Override
	public String toString() {
		return "SalesManager [salesVolume=" + salesVolume + ", percent=" + percent + ", toString()=" + super.toString()
				+ "]";
	}

	
	public double calculateSalary() {
		double salary=salesVolume*percent;
		if(salary<= super.getHour()*StateConstants.MIN_WAGE) {
			salary=super.getHour()*StateConstants.MIN_WAGE;
			return salary;
		}
		return salary;
		
	}
	
	
	
	

}
