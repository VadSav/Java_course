
public class Person implements Comparable<Person>{
	
String name ;
int age;

public Person(String name, int age) {
	
	super();
	this.name = name;
	this.age = age;
}

@Override
public int compareTo(Person o) {
	if (age> o.age){
		return 1;
	}else 
		if(age<o.age){
			return -1;
	}
	return 0;
}
}
