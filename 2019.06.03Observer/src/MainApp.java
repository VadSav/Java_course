
public class MainApp {
	


    public static void main(String[] args) {
        ObservedClass observable = new ObservedClass();
        Observer1 observer1 = new Observer1();
        Pereson pereson1 = new Pereson("Oleg");
        Pereson pereson2 = new Pereson("Andy");

        observable.addObserver(observer1);
        observable.addObserver(pereson1);
        observable.addObserver(pereson2);

        observable.stateChanged("hello");

    }





}

