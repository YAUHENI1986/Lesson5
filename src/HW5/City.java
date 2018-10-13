package HW5;

public class City {  //город
	String nameCity;
	double squareCity;
	int peopleCity;
	
	City (String nameCity, double squareCity, int peopleCity) {
		this.nameCity = nameCity;
		this.squareCity = squareCity;
		this.peopleCity = peopleCity;
	}
	
	public void printInfoCity (City city) {
		System.out.println(city.nameCity + " , население " + city.peopleCity + " человек, площадь - " + city.squareCity + " км/кв");
	}

}
