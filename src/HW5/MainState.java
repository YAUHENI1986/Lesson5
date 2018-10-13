package HW5;

//Создать объект класса Государство, используя классы Область, Район, Город.
//Методы: вывести на консоль столицу, количество областей, площадь, областные центры.

public class MainState {

	public static void main(String[] args) {
		City minsk = new City ("Минск", 348.8, 1982500);
		City borisov = new City ("Борисов", 46, 143051);
		City brest = new City ("Брест", 146.12, 347576);
		City baranovichi = new City ("Барановичи", 84.96, 30850);
		City mogilev = new City ("Могилёв", 118.50, 381353);
		City shklov = new City ("Шклов", 10.7, 16300);
		City gomel = new City ("Гомель", 139.77, 535229);
		City mozer = new City ("Мозырь", 44.1831, 111773);
		City grodno = new City ("Гродно", 142.11, 368662);
		City lida = new City ("Лида", 40.57, 131860);
		City vitebsk = new City ("Витебск", 134.601, 370298);
		City orsha = new City ("Орша", 42.09, 157526);
		
		
		State nashaBelarasha = new State ("Беларусь", 6);
		
		nashaBelarasha.addCapitalOfState(minsk);
		
		nashaBelarasha.addRegion("Минская область", 22);
		nashaBelarasha.addRegion("Брестская область", 16);
		nashaBelarasha.addRegion("Могилёвская область", 21);
		nashaBelarasha.addRegion("Гомельская область", 21);
		nashaBelarasha.addRegion("Гродненская область", 17);
		nashaBelarasha.addRegion("Витебская область", 21);
		
		nashaBelarasha.addAdmСenterOfRegion("Минская область", minsk);
		nashaBelarasha.addAdmСenterOfRegion("Брестская область", brest);
		nashaBelarasha.addAdmСenterOfRegion("Могилёвская область", mogilev);
		nashaBelarasha.addAdmСenterOfRegion("Гомельская область", gomel);
		nashaBelarasha.addAdmСenterOfRegion("Гродненская область", grodno);
		nashaBelarasha.addAdmСenterOfRegion("Витебская область", vitebsk);
				
		nashaBelarasha.addArea("Минская область", "Минский район", 1, minsk);
		nashaBelarasha.addArea("Минская область", "Борисовский район", 1, borisov);
		nashaBelarasha.addArea("Брестская область", "Брестский район", 1, brest);
		nashaBelarasha.addArea("Брестская область", "Барановичский район", 1, baranovichi);
		nashaBelarasha.addArea("Могилёвская область", "Могилёвский район", 1, mogilev);
		nashaBelarasha.addArea("Могилевская область", "Шкловский район", 1, shklov);
		nashaBelarasha.addArea("Гомельская область", "Гомельский район", 1, gomel);
		nashaBelarasha.addArea("Гомельская область", "Мозырский район", 1, mozer);
		nashaBelarasha.addArea("Гродненская область", "Гродненский район", 1, grodno);
		nashaBelarasha.addArea("Гродненская область", "Лидский район", 1, lida);
		nashaBelarasha.addArea("Витебская область", "Витебский район", 1, vitebsk);
		nashaBelarasha.addArea("Витебская область", "Оршанский район", 1, orsha);
		
		nashaBelarasha.addCityInArea("Минский район", minsk);
		nashaBelarasha.addCityInArea("Борисовский район", borisov);
		nashaBelarasha.addCityInArea("Брестский район", brest);
		nashaBelarasha.addCityInArea("Барановичский район", baranovichi);
		nashaBelarasha.addCityInArea("Могилёвский район", mogilev);
		nashaBelarasha.addCityInArea("Шкловский район", shklov);
		nashaBelarasha.addCityInArea("Гомельский район", gomel);
		nashaBelarasha.addCityInArea("Мозырский район", mozer);
		nashaBelarasha.addCityInArea("Гродненский район", grodno);
		nashaBelarasha.addCityInArea("Лидский район", lida);
		nashaBelarasha.addCityInArea("Витебский район", vitebsk);
		nashaBelarasha.addCityInArea("Оршанский район", orsha);
		
		nashaBelarasha.printInfoState();
		System.out.println();
	}

}