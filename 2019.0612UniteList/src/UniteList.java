
import java.util.ArrayList;
import java.util.List;

public class UniteList{

public static void main(String[] args) {

    List<String> l1 = new ArrayList<String>();
     l1.add("1");
     l1.add("2");
     l1.add("3");
     l1.add("4");
     l1.add("5");
     l1.add("6");
    List<String> l2 = new ArrayList<String>();
     l2.add("1");
     l2.add("7");
     l2.add("8");
     l2.add("9");
     l2.add("10");
     l2.add("3");
    List<String> l3 = new ArrayList<String>();
     l3.addAll(l1);
     l3.addAll(l2);
    for (int i = 0; i < l3.size(); i++) {
        for (int j=i+1; j < l3.size(); j++) {
             if(l3.get(i) == l3.get(j)) {
                 l3.remove(j);
            }
        }
    }
    System.out.println(l3);
}

}