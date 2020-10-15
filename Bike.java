//@method overriding

class Vehicle{
	void getTyres() {
		System.out.println("Enter the number of tyres");

	}
}
public class Bike extends Vehicle {
	void getTyres() {
		System.out.println("Contains two wheels");
	}
	public static void main(String [] args) {
		Bike obj=new Bike();//No upcasting
		obj.getTyres();
	}
}
