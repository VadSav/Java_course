

public class Main {

public static void main(String[] args) {
Bus bus1 = new Bus();
Bus bus2 = new Bus();
Bus bus3 = new Bus();
Bus bus4 = new Bus("M400");
Bus bus5 = new Bus("M500", 80);
Bus bus6;
bus6 = bus5;

System.out.println("bus1 ");
bus1.printBus();


System.out.println("bus5 ");
bus5.printBus();
System.out.println("bus6 ");
bus5.printBus();
System.out.println();
bus6.spedUp(100);

System.out.println("bus5 ");
bus5.printBus();
System.out.println("bus6 ");
bus6.printBus();
System.out.println();

bus5=bus4;
bus6.spedUp(10);
System.out.println("bus5 ");
bus5.printBus();
System.out.println("bus6 ");
bus6.printBus();
System.out.println();

bus6=new Bus("M600");






bus1.setNumber("M100");
bus2.setNumber("M200");
bus3.setNumber("M300");


Bus[] buses= {bus1,bus2,bus3, bus4,bus5}; 
Bus[] buses2 = new Bus[20];

for(int i=0;i<buses.length; i++) {
//buses[i].start();
buses[i].printBus();
}

System.out.println("-----------------------------------------");


bus1.spedUp();
bus2.spedDown();

bus1.printBus();
bus2.printBus();
bus3.printBus();

bus3.stop();
bus3.printBus(); 
bus3.printBus();

bus4.spedUp(5.6);
bus4.printBus();
bus4.spedUp(6.8);
bus4.printBus();



Main mainInstance = new Main();
mainInstance.sayHello();


System.out.println("------------------- Array of Bus ----------------------");

for (int i = 0; i < buses2.length; i++) {
buses2[i]= new Bus("M0"+i,80);
buses2[i].printBus();
}


}

public void sayHello() {
System.out.println("I'am class Main. Hello!");
}



}