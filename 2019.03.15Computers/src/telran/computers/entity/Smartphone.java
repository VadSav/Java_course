package telran.computers.entity;

public class Smartphone extends computer {
	private int imei;

	public Smartphone(int ram, int hdd, String cpu, String brand, int imei) {
		super(ram, hdd, cpu, brand);
		this.imei = imei;
	}

	public int getImei() {
		return imei;
	}

	public void setImei(int imei) {
		this.imei = imei;
	}

	@Override
	public String toString() {
		return "Smartphone [imei=" + imei + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + imei;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Smartphone other = (Smartphone) obj;
		if (imei != other.imei)
			return false;
		return true;
	}

}
