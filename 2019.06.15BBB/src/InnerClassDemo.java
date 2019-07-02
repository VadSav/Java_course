
import java.util.Comparator;

public class InnerClassDemo {

private String someField;

public InnerClassDemo(String someField) {
this.someField = someField;
}

public static void main(String[] args) {

StringByLengthComparator sc = new StringByLengthComparator();

InnerClassDemo m = new InnerClassDemo("ssdsfsfd");
m.innerMethodDemo();

}
public void innerMethodDemo(){
SomeClass s = new SomeClass("text");
System.out.println(s.value);
}