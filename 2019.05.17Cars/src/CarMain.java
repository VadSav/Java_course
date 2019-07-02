
import java.util.Arrays;
import java.util.Comparator;

public class CarMain {

    public static void main(String[] args) {

        Car car1 = new Car("Toyota", 2015, 15000);
        Car car2 = new Car("Ford", 2010, 25000);
        Car car3 = new Car("Chevrolet", 1998, 6000);
        Car car4 = new Car("BMW", 2018, 33000);
        
        Car car7 = new Car("Chevrolet", 1995, 600);
        Car car5 = new Car("Porsche", 2012, 9000);
        Car[] cars = {car1, car2, car3, car4,car7, car5};

        Arrays.sort(cars);

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
        System.out.println("______________________________________");
        Comparator<Car> comp = new ComparatorByModel();
        Arrays.sort(cars, comp.thenComparing(new ComparatorByPrice()));


        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
        System.out.println("-------------------------------");

        Arrays.sort(cars, new ComparatorByPrice());

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }

   

    }


