package HW5;

public class State {  //государство
		
	String nameState;
	double squareState;
	int peopleState;
	int countRegionInState;
	
	City CapitalOfState;
	Region [] state;
	Area [] region;
	
	State (String nameState, int countRegionInState) {
		this.nameState = nameState;
		this.countRegionInState = countRegionInState;
		Region [] x = new Region [countRegionInState];
		this.state = x;
	}
	
	
	public void addRegion (String nameRegion, int countAreaInRegion) {  //добавление области
		if (state[state.length-1] != null) {
			System.out.println("Список областей полон! Значение " + nameRegion + " - не может быть добавлено!!!");
		}		
		for (int i = 0; i<state.length; i++) {
			if (state[i] == null) {
				Region x = new Region (nameRegion, countAreaInRegion);
				state[i] = x;
				break;
			}
		}
	}
	
	public void addAdmСenterOfRegion (String nameRegion, City admСenterOfRegion) {  //добавление админ. центра области
		for (int i = 0; i<state.length; i++) {
			if (state[i].nameRegion.equals(nameRegion)) {
				state[i].admСenterOfRegion = admСenterOfRegion;
			}
		}
		
	}
	
	public void addArea (String nameRegion, String nameArea, int countCityInArea, City admСenterOfArea) {  //добавление района с админ. центром
		for (int i = 0; i<state.length; i++) {
			if (state[i].nameRegion.equals(nameRegion)) {
				if (state[i].region[state[i].region.length-1] != null) {
					System.out.println("Список регионов в " + nameRegion + " полон! Значение " + nameArea + " - не может быть добавлено!!!");
				}
				for (int a = 0; a<state[i].region.length; a++) {
					if (state[i].region[a] == null) {
						Area x = new Area (nameArea, countCityInArea);
						state[i].region[a] = x;
						state[i].region[a].admСenterOfArea = admСenterOfArea;						
						break;
					}
				}
			}
		}
	}
	
	public void addCityInArea (String nameArea, City x) {  //добавление города в район
		for (int i = 0; i<state.length; i++) {
			if (state[i] != null) {
				for (int in = 0; in<state[i].region.length; in++) {
					if (state[i].region[in] != null) {
						for (int intt = 0; intt<state[i].region[in].area.length; intt++) {
							if (state[i].region[in].nameArea.equals(nameArea)) {
								if (state[i].region[in].area[state[i].region[in].area.length-1] != null) {
									System.out.println("Список районов " + nameArea + " полон! Город " + x.nameCity + " - не может быть добавлен!!!");
								}
								state[i].region[in].area[intt] = x;
							}
						}
					}
				}
			}
		}
	}
		
	public void addCapitalOfState (City x) {   //добавление столицы государства
		CapitalOfState = x;
	}
	
	public void changeNameOfCity (City x, String newName) {  //изменение названия города
		x.nameCity = newName;
	}
	
	public void printInfoState () {   //информация об государстве
		for (int i = 0; i<state.length; i++) {
			if (state[i] != null) {
				for (int in = 0; in<state[i].region.length; in++) {
					if (state[i].region[in] != null) {
						for (int innt = 0; innt<state[i].region[in].area.length; innt++) {
							if (state[i].region[in].area[innt] != null) {
								peopleState += state[i].region[in].area[innt].peopleCity;
								squareState += state[i].region[in].area[innt].squareCity;
								state[i].peopleRegion += state[i].region[in].area[innt].peopleCity;
								state[i].squareRegion += state[i].region[in].area[innt].squareCity;
							}
						}
					}
				}
			}
		}
		System.out.println("Государство - " + nameState);
		System.out.println("Столица - " + CapitalOfState.nameCity);
		System.out.println("Количество областей - " + state.length);
		for (int i = 0; i<state.length; i++) {
			System.out.println(state[i].nameRegion + " , население " + state[i].peopleRegion + ", площадь " + state[i].squareRegion + "км*кв, областной центр " + state[i].admСenterOfRegion.nameCity);
		}
		System.out.println("Общая площадь государства - " + squareState + " км*кв");
		System.out.println("Общее количество населения государства - " + peopleState + " чел");
		
	}
	

}
