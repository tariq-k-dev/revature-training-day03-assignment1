package com.revature.day03.assigmnent1;

public class AnimalCreator {

	public static void main(String[] args) {
		Lion lion = new Lion("animals", "roars", "savannah");
		Cat cat = new Cat("cat food", "meows", "house");

		lion.eat();
		cat.eat();
		lion.makeNoise();
		cat.makeNoise();
		lion.returnLocation();
		cat.returnLocation();
	}

}
