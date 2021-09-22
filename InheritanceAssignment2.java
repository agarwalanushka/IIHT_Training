package assignmentSep22;

class Vehicle{
	
	void features() {
		
	}	
}

class Car extends Vehicle{
	 Car() {
		System.out.println("Car has the following features ");
	}
	void features(String str) {
		System.out.println(str+" is a reliable and steardy car ");
	}
}

class Bike extends Vehicle{
	Bike() {
		System.out.println("Bike has the following features ");
	}
	void features(String str) {
		System.out.println(str+" looks amazing ");
	}
}
public class InheritanceExample2 {
	public static void main(String[] args) {
		Vehicle veh = new Vehicle();
		
		Car car = new Car();
		car.features("Maruti");
		
		Bike bike = new Bike();
		bike.features("Harley");
	}

}
