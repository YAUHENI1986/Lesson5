package lesson5;

import java.util.Random;

public class Car {
	String name;  //название машины
	String color;   //цвет машины
	int door;   //количество дверей в машине
	Motor motor;
	
	Wheel frontLeft;
	Wheel frontRight;
	Wheel rearLeft;
	Wheel rearRight;
	Wheel stepney;
	double fuel = 50;   //топливо в баке 
	int carMileage = 0;   //пробег машины
	
	public Car (String name, String color, int door) {
		this.name = name;
		this.color = color;
		this.door = door;
	}
	
	public void addMotor (Motor x) {
		this.motor = x;
	}
	
	public void addWheels (Wheel x) {
		Wheel frontLeft = new Wheel(x.type, x.name, x.size);
		Wheel frontRight = new Wheel(x.type, x.name, x.size);
		Wheel rearLeft = new Wheel(x.type, x.name, x.size);
		Wheel rearRight = new Wheel(x.type, x.name, x.size);
		Wheel stepney = new Wheel(x.type, x.name, x.size);
		this.frontLeft = frontLeft;
		this.frontRight = frontRight;
		this.rearLeft = rearLeft;
		this.rearRight = rearRight;
		this.stepney = stepney;
	}
	
	public void run (double x) {					//метод движение машины
		if (fuel<=0 || frontLeft.status == false || frontRight.status == false || rearLeft.status == false || rearRight.status == false) {
			if (fuel<=0) {
				System.out.println("Заправтесь пожалуйста");
			}
			if (frontLeft.status == false) {
				System.out.println("Замените переднее левое колесо!!");
			}
			if (frontRight.status == false) {
				System.out.println("Замените переднее правое колесо!!");
			}
			if (rearLeft.status == false) {
				System.out.println("Замените заднее левое колесо!!");
			}
			if (rearRight.status == false) {
				System.out.println("Замените заднее правое колесо!!");
			}
			
		} else {
			double i;
			for (i = 0; i<x; i+=1) {
				fuel-=(motor.fuelConsumption/100);
				if (fuel<=0) {
					carMileage += i;
					System.out.println("У вас закончилось топливо!!! Вы проехали " + carMileage + " км!");
					break;
				}
			}
			if (fuel>0) {
				carMileage += i;
				System.out.println("Вы проехали " + carMileage + " км! Остаток топлива - " + fuel + "л");
			}
		}
	}
	
	public void gasStation (double x) {				//заправка мишины
		fuel += x;
		System.out.println("Вы заправились! Можете ехать!");
	}
	
	public void infоCarMileage () {					//метод информации о пробеге машины
		System.out.println("Вы проехали - " + carMileage + " км");
	}
	
	public void wheelPuncture () {					//метод прокола колеса
		Random random = new Random();
		int x = random.nextInt(4)+1;
		switch (x) {
			case 1:{
				frontLeft.status = false;
				break;
			}
			case 2:{
				frontRight.status = false;
				break;
			}
			case 3:{
				rearLeft.status = false;
				break;
			}
			case 4:{
				rearRight.status = false;
				break;
			}
		}
		System.out.println("У вас прокол колеса!!!!!!!!!");
	}
	
	public void wheelReplacement () {				//метод замены колеса
		if (stepney.status == true) {
			if (frontLeft.status == false) {
				Wheel x = new Wheel(color, color, fuel);
				x = frontLeft;
				frontLeft = stepney;
				stepney = x;
				System.out.println("Вы заменили переднее левое колесо");
			}
			if (frontRight.status == false) {
				Wheel x = new Wheel(color, color, fuel);
				x = frontRight;
				frontRight = stepney;
				stepney = x;
				System.out.println("Вы заменили переднее правое колесо");
			}
			if (rearLeft.status == false) {
				Wheel x = new Wheel(color, color, fuel);
				x = rearLeft;
				rearLeft = stepney;
				stepney = x;
				System.out.println("Вы заменили заднее левое колесо");
			}
			if (rearRight.status == false) {
				Wheel x = new Wheel(color, color, fuel);
				x = rearRight;
				rearRight = stepney;
				stepney = x;
				System.out.println("Вы заменили заднее правое колесо");
			}
		} else {
			System.out.println("Извените - вы уже использовали запаску! Вызывайте эвакуатор!");
		}
	}
	
	public void printCarInfo (Car x) {					////метод вывода информации об авто
		System.out.println("--- Информация о машине " + x.name + " --------------------------------------------------");
		System.out.println("Цвет - "+ x.color + " Объем двигателя -  " + x.motor.volumeMotor + " Пробег - " + x.carMileage + " Размер колес - " + x.frontLeft.size + "\"");
		System.out.println("-----------------------------------------------------------------------------------------");
	}
	

}
