package HW5;

public class Area {   //‡ÈÓÌ
		
	String nameArea;
	double squareArea;
	int peopleArea;
	int countCityInArea;
	
	City adm—enterOfArea;
	City [] area;
	
	Area (String nameArea, int countCityInArea) {
		this.nameArea = nameArea;
		this.countCityInArea = countCityInArea;	
		City [] x = new City[countCityInArea];
		this.area = x;
	}
	
	public void addAdm—enterOfArea (City x) {
		adm—enterOfArea = x;
	}

}
