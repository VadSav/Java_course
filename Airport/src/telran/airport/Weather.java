package telran.airport;

public abstract  class Weather {
	
	private String hurricane ;
	private String sunny ;

	

	
	public Weather(String hurricane, String sunny) {
		super();
		this.hurricane = hurricane;
		this.sunny = sunny;
	}
	public String getHurricane() {
		return hurricane;
	}

	public String getSunny() {
		return sunny;
	}

	
	

}
