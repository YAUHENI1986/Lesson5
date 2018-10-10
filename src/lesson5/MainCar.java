package lesson5;

public class MainCar {

	public static void main(String[] args) {
		Motor v4 = new Motor (2.5, 6, 6.7);
		Motor v6 = new Motor (3.8, 8, 10.2);
		
		Wheel mishlen = new Wheel ("Litue", "Mishlen", 15.5);
		Wheel belsina = new Wheel ("Shtampovka", "Belsina", 14.0);
		
		Car bmw = new Car ("BMW", "Black", 5);
		Car gaz = new Car ("GAZ", "Rad", 3);
		
		
		
		
		bmw.addMotor(v6);
		bmw.addWheels(mishlen);
		
		gaz.addMotor(v4);
		gaz.addWheels(belsina);
		
		System.out.println("----------------------");
		
		bmw.printCarInfo(bmw);
		gaz.printCarInfo(gaz);
		
		bmw.run(1000);
		bmw.gasStation(50);
		bmw.run(1000);
		bmw.gasStation(50);
		bmw.wheelPuncture();
		bmw.run(1000);
		bmw.wheelReplacement();
		bmw.run(1);
		bmw.wheelPuncture();
		bmw.wheelReplacement();
		bmw.wheelReplacement();
		bmw.infîCarMileage();
		
		System.out.println();
		
		gaz.infîCarMileage();
		gaz.run(1000);
		gaz.gasStation(100);
		gaz.run(1000);
		gaz.infîCarMileage();
		
		bmw.printCarInfo(bmw);
		gaz.printCarInfo(gaz);
		System.out.println();
	}

}
