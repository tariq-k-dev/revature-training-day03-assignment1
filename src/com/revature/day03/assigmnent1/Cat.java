package com.revature.day03.assigmnent1;

public class Cat extends Feline {
	

	private String location;
	
	public Cat() {}

	public Cat(String food, String sound, String location) {
		this.food = food;
		this.sound = sound;
		this.location = location;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setFood(String food) {
		this.food = food;	
	}
	
	public String getFood() {
		return food;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public String getSound() {
		return sound;
	}

	public void makeNoise() {
		System.out.println("A cat " + sound);
	}

	public void eat() {
		System.out.println("A cat eats " + food);
	}

	public void returnLocation() {
		System.out.println("A cat lives in a " + location);
	}
}
