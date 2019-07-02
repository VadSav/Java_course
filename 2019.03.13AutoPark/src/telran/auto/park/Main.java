package telran.auto.park;

public class Main {

	public static void main(String[] args) {
		
		
		AutoPark autoPark = new AutoPark();
		Bus b1 = new Bus("M001", 80);
		Bus b2 = new Bus("M002", 80);
		Bus b3 = new Bus("M003", 80);
		Route r1 = new Route("Potsdam","Moscow",1700);
		Route r2 = new Route("Berlin","Potsdam",100);
		Route r3 = new Route("Potsdam","Dresden",320);
		Driver d1 = new Driver("Ivan Ivanov");
		Driver d2 = new Driver("Sergey Ivanov");
		Driver[] drivers = {d1,d2, new Driver("Petr Petrov"),
			new Driver("Olga Sidorova")
		};
		
		AutoPark autoPark2 = new AutoPark(drivers);	
		
		System.out.println(b1);
		System.out.println(r1);
		System.out.println(d1);
		System.out.println("---------------------------------------");
		Trip t1= b1.doTrip(r1, d1);
		Trip t2= b2.doTrip(r1, d2);
		Trip t3= b3.doTrip(r1, d1);
		
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(autoPark2.getBus().doTrip(r2, autoPark2.getDriver()));
		System.out.println(autoPark2.getBus().doTrip(r1, autoPark2.getDriver()));
		System.out.println(autoPark2.getBus().doTrip(r3, autoPark2.getDriver()));
		System.out.println(autoPark2.getBus().doTrip(r2, autoPark2.getDriver()));

		System.out.println("----------------------- List -----------------------------");
		TripList tr= new TripList();
		tr.add(t1);
		tr.add(t2);
		tr.print();
		tr.add(t3);
		System.out.println("----------------------- List2 -----------------------------");
		
		tr.print();
		tr.add(t1, 1);
		tr.print();
		
		// IS-A (any Boy IS A Person) 
		// HAS-A (any Boy HAS A Hands)
	    }

	}
