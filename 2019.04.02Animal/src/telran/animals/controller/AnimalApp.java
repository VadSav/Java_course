package telran.animals.controller;

import telran.animals.emtity.Animal;
import telran.animals.emtity.Cat;
import telran.animals.emtity.Dog;
import telran.animals.emtity.Girafe;
import telran.animals.emtity.Sheep;

public class AnimalApp {

	public static void main(String[] args) {
		
		
		Dog d1 = new Dog(50, 30, 5, "Sharik", 25);
		Cat c1 = new Cat(15, 9, 15, "Garfid", 72);
		Sheep s1 = new Sheep(40, 40, 4, "Baran", 60);
		Girafe g1 = new Girafe(100, 150, 7, "djadja Stjopa", 80);
		
		Animal[] animals=new Animal[4];
		animals[0]=d1;
		animals[1]=c1;
		animals[2]=s1;
		animals[3]=g1;
		
		cantata(animals);

	}
	
	public static void cantata(Animal[] animals){
		for(int i = 0; i < animals.length; i++){
			animals[i].voice();
		}
	}

}
