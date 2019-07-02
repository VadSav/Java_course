
public class Bus {


private String number;
private int capacity;
private double speed=0;
private double maxSped=200;
//Driver driver;

public Bus() {}

public Bus(String number) {
this.number=number;
}

public Bus(String number, int capacity) {
this.number=number;
this.capacity=capacity;
}


void start() {
this.speed=20.0;
}

void spedUp() {
if (speed<maxSped) speed+=10;

}

void spedUp(double speed) {
if (this.speed<maxSped) this.speed+=speed;

}

void spedDown() {
speed-=10;
}

void setNumber(String num) {
number=num;
}

void stop() {
speed=0.0;
}

void printBus() {
System.out.println("The bus № "+number + " capacity is- "+ capacity + " speed is -" + speed);
}

}