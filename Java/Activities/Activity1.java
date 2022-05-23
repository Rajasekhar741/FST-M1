package activities;

class Car {

	String color, transmission;
	int make, tyres, doors;
	
	Car(){
		this.tyres = 4;
		this.doors = 4;
	}

	void displayCharacteristics() {
	
	System.out.println("Displaying color: " + color );
	System.out.println("Displaying transmission: " + transmission);
	System.out.println("Displaying make: " + make);
	System.out.println("Displaying tyres: " + tyres);
	System.out.println("Displaying doors: " + doors);
	
	}
	
	void accelarate() {
		System.out.println("Car is moving forward");
	}
	
	void brake() {

	System.out.println("Car has stopped");
	}
	
}
	


public class Activity1 {

	
	public static void main(String[] args) {
		
		Car i20 = new Car();
		i20.make = 2014;
		i20.color = "Black";
		i20.transmission= "Manual";
		
		i20.displayCharacteristics();
		i20.accelarate();
		i20.brake();
		
		
		
	}
	
}
