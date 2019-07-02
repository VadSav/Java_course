
import java.util.Random;

public class AutoPark {
    private int quantityBuses =10;
    private int quantityDrivers =3;
    private Random rnd = new Random(System.currentTimeMillis());
    
    private Bus[] buses = new Bus[quantityBuses];
    private Driver[] drivers = new Driver[quantityDrivers];
    
    
    public AutoPark(Driver[] drivers) {
	for (int i = 0; i < buses.length; i++) {
	    buses[i] = new Bus("M00"+(i+1),80);
	}
	/// read from BD
	this.drivers=drivers;
	
    }
    
    
    public AutoPark() {
	for (int i = 0; i < buses.length; i++) {
	    buses[i] = new Bus("M00"+(i+1),80);
	}
	/// read from BD
	drivers[0] = new Driver("Ivan Ivanov");
	drivers[1] = new Driver("Sergey Ivanov");
	drivers[2] = new Driver("Gans Muller");
//	drivers[3] = d1;  // ERROR
	
    }
    
    public Bus getBus(){

	return buses[rnd.nextInt(quantityBuses)];
    }
    
    public Driver getDriver(){
	
	return drivers[rnd.nextInt(quantityDrivers)];
    }
    

}
