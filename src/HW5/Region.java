package HW5;

public class Region {  //Ó·Î‡ÒÚ¸
		
	String nameRegion;
	double squareRegion;
	int peopleRegion;
	int countAreaInRegion;
	
	City adm—enterOfRegion;
	Area [] region;
	
	Region (String nameRegion, int countAreaInRegion) {
		this.nameRegion = nameRegion;
		this.countAreaInRegion = countAreaInRegion;
		Area [] x = new Area[countAreaInRegion];
		this.region = x;
	}
	
	public void addAdm—enterOfRegion (City x) {
		adm—enterOfRegion = x;
	}

}
