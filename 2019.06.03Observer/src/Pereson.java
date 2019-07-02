
public class Pereson  implements Observer{
    String name;

    public Pereson(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent() {
        System.out.println("Person " + name + "reseved massage");
    }
}
