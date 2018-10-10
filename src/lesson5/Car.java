package lesson5;

import java.util.Random;

public class Car {
	String name;  //�������� ������
	String color;   //���� ������
	int door;   //���������� ������ � ������
	Motor motor;
	
	Wheel frontLeft;
	Wheel frontRight;
	Wheel rearLeft;
	Wheel rearRight;
	Wheel stepney;
	double fuel = 50;   //������� � ���� 
	int carMileage = 0;   //������ ������
	
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
	
	public void run (double x) {					//����� �������� ������
		if (fuel<=0 || frontLeft.status == false || frontRight.status == false || rearLeft.status == false || rearRight.status == false) {
			if (fuel<=0) {
				System.out.println("���������� ����������");
			}
			if (frontLeft.status == false) {
				System.out.println("�������� �������� ����� ������!!");
			}
			if (frontRight.status == false) {
				System.out.println("�������� �������� ������ ������!!");
			}
			if (rearLeft.status == false) {
				System.out.println("�������� ������ ����� ������!!");
			}
			if (rearRight.status == false) {
				System.out.println("�������� ������ ������ ������!!");
			}
			
		} else {
			double i;
			for (i = 0; i<x; i+=1) {
				fuel-=(motor.fuelConsumption/100);
				if (fuel<=0) {
					carMileage += i;
					System.out.println("� ��� ����������� �������!!! �� �������� " + carMileage + " ��!");
					break;
				}
			}
			if (fuel>0) {
				carMileage += i;
				System.out.println("�� �������� " + carMileage + " ��! ������� ������� - " + fuel + "�");
			}
		}
	}
	
	public void gasStation (double x) {				//�������� ������
		fuel += x;
		System.out.println("�� �����������! ������ �����!");
	}
	
	public void inf�CarMileage () {					//����� ���������� � ������� ������
		System.out.println("�� �������� - " + carMileage + " ��");
	}
	
	public void wheelPuncture () {					//����� ������� ������
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
		System.out.println("� ��� ������ ������!!!!!!!!!");
	}
	
	public void wheelReplacement () {				//����� ������ ������
		if (stepney.status == true) {
			if (frontLeft.status == false) {
				Wheel x = new Wheel(color, color, fuel);
				x = frontLeft;
				frontLeft = stepney;
				stepney = x;
				System.out.println("�� �������� �������� ����� ������");
			}
			if (frontRight.status == false) {
				Wheel x = new Wheel(color, color, fuel);
				x = frontRight;
				frontRight = stepney;
				stepney = x;
				System.out.println("�� �������� �������� ������ ������");
			}
			if (rearLeft.status == false) {
				Wheel x = new Wheel(color, color, fuel);
				x = rearLeft;
				rearLeft = stepney;
				stepney = x;
				System.out.println("�� �������� ������ ����� ������");
			}
			if (rearRight.status == false) {
				Wheel x = new Wheel(color, color, fuel);
				x = rearRight;
				rearRight = stepney;
				stepney = x;
				System.out.println("�� �������� ������ ������ ������");
			}
		} else {
			System.out.println("�������� - �� ��� ������������ �������! ��������� ���������!");
		}
	}
	
	public void printCarInfo (Car x) {					////����� ������ ���������� �� ����
		System.out.println("--- ���������� � ������ " + x.name + " --------------------------------------------------");
		System.out.println("���� - "+ x.color + " ����� ��������� -  " + x.motor.volumeMotor + " ������ - " + x.carMileage + " ������ ����� - " + x.frontLeft.size + "\"");
		System.out.println("-----------------------------------------------------------------------------------------");
	}
	

}
