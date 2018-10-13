package HW5;

public class State {  //�����������
		
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
	
	
	public void addRegion (String nameRegion, int countAreaInRegion) {  //���������� �������
		if (state[state.length-1] != null) {
			System.out.println("������ �������� �����! �������� " + nameRegion + " - �� ����� ���� ���������!!!");
		}		
		for (int i = 0; i<state.length; i++) {
			if (state[i] == null) {
				Region x = new Region (nameRegion, countAreaInRegion);
				state[i] = x;
				break;
			}
		}
	}
	
	public void addAdm�enterOfRegion (String nameRegion, City adm�enterOfRegion) {  //���������� �����. ������ �������
		for (int i = 0; i<state.length; i++) {
			if (state[i].nameRegion.equals(nameRegion)) {
				state[i].adm�enterOfRegion = adm�enterOfRegion;
			}
		}
		
	}
	
	public void addArea (String nameRegion, String nameArea, int countCityInArea, City adm�enterOfArea) {  //���������� ������ � �����. �������
		for (int i = 0; i<state.length; i++) {
			if (state[i].nameRegion.equals(nameRegion)) {
				if (state[i].region[state[i].region.length-1] != null) {
					System.out.println("������ �������� � " + nameRegion + " �����! �������� " + nameArea + " - �� ����� ���� ���������!!!");
				}
				for (int a = 0; a<state[i].region.length; a++) {
					if (state[i].region[a] == null) {
						Area x = new Area (nameArea, countCityInArea);
						state[i].region[a] = x;
						state[i].region[a].adm�enterOfArea = adm�enterOfArea;						
						break;
					}
				}
			}
		}
	}
	
	public void addCityInArea (String nameArea, City x) {  //���������� ������ � �����
		for (int i = 0; i<state.length; i++) {
			if (state[i] != null) {
				for (int in = 0; in<state[i].region.length; in++) {
					if (state[i].region[in] != null) {
						for (int intt = 0; intt<state[i].region[in].area.length; intt++) {
							if (state[i].region[in].nameArea.equals(nameArea)) {
								if (state[i].region[in].area[state[i].region[in].area.length-1] != null) {
									System.out.println("������ ������� " + nameArea + " �����! ����� " + x.nameCity + " - �� ����� ���� ��������!!!");
								}
								state[i].region[in].area[intt] = x;
							}
						}
					}
				}
			}
		}
	}
		
	public void addCapitalOfState (City x) {   //���������� ������� �����������
		CapitalOfState = x;
	}
	
	public void changeNameOfCity (City x, String newName) {  //��������� �������� ������
		x.nameCity = newName;
	}
	
	public void printInfoState () {   //���������� �� �����������
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
		System.out.println("����������� - " + nameState);
		System.out.println("������� - " + CapitalOfState.nameCity);
		System.out.println("���������� �������� - " + state.length);
		for (int i = 0; i<state.length; i++) {
			System.out.println(state[i].nameRegion + " , ��������� " + state[i].peopleRegion + ", ������� " + state[i].squareRegion + "��*��, ��������� ����� " + state[i].adm�enterOfRegion.nameCity);
		}
		System.out.println("����� ������� ����������� - " + squareState + " ��*��");
		System.out.println("����� ���������� ��������� ����������� - " + peopleState + " ���");
		
	}
	

}
