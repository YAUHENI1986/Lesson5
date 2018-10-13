package HW5;

//������� ������ ������ �����������, ��������� ������ �������, �����, �����.
//������: ������� �� ������� �������, ���������� ��������, �������, ��������� ������.

public class MainState {

	public static void main(String[] args) {
		City minsk = new City ("�����", 348.8, 1982500);
		City borisov = new City ("�������", 46, 143051);
		City brest = new City ("�����", 146.12, 347576);
		City baranovichi = new City ("����������", 84.96, 30850);
		City mogilev = new City ("������", 118.50, 381353);
		City shklov = new City ("�����", 10.7, 16300);
		City gomel = new City ("������", 139.77, 535229);
		City mozer = new City ("������", 44.1831, 111773);
		City grodno = new City ("������", 142.11, 368662);
		City lida = new City ("����", 40.57, 131860);
		City vitebsk = new City ("�������", 134.601, 370298);
		City orsha = new City ("����", 42.09, 157526);
		
		
		State nashaBelarasha = new State ("��������", 6);
		
		nashaBelarasha.addCapitalOfState(minsk);
		
		nashaBelarasha.addRegion("������� �������", 22);
		nashaBelarasha.addRegion("��������� �������", 16);
		nashaBelarasha.addRegion("���������� �������", 21);
		nashaBelarasha.addRegion("���������� �������", 21);
		nashaBelarasha.addRegion("����������� �������", 17);
		nashaBelarasha.addRegion("��������� �������", 21);
		
		nashaBelarasha.addAdm�enterOfRegion("������� �������", minsk);
		nashaBelarasha.addAdm�enterOfRegion("��������� �������", brest);
		nashaBelarasha.addAdm�enterOfRegion("���������� �������", mogilev);
		nashaBelarasha.addAdm�enterOfRegion("���������� �������", gomel);
		nashaBelarasha.addAdm�enterOfRegion("����������� �������", grodno);
		nashaBelarasha.addAdm�enterOfRegion("��������� �������", vitebsk);
				
		nashaBelarasha.addArea("������� �������", "������� �����", 1, minsk);
		nashaBelarasha.addArea("������� �������", "����������� �����", 1, borisov);
		nashaBelarasha.addArea("��������� �������", "��������� �����", 1, brest);
		nashaBelarasha.addArea("��������� �������", "������������� �����", 1, baranovichi);
		nashaBelarasha.addArea("���������� �������", "���������� �����", 1, mogilev);
		nashaBelarasha.addArea("����������� �������", "��������� �����", 1, shklov);
		nashaBelarasha.addArea("���������� �������", "���������� �����", 1, gomel);
		nashaBelarasha.addArea("���������� �������", "��������� �����", 1, mozer);
		nashaBelarasha.addArea("����������� �������", "����������� �����", 1, grodno);
		nashaBelarasha.addArea("����������� �������", "������� �����", 1, lida);
		nashaBelarasha.addArea("��������� �������", "��������� �����", 1, vitebsk);
		nashaBelarasha.addArea("��������� �������", "��������� �����", 1, orsha);
		
		nashaBelarasha.addCityInArea("������� �����", minsk);
		nashaBelarasha.addCityInArea("����������� �����", borisov);
		nashaBelarasha.addCityInArea("��������� �����", brest);
		nashaBelarasha.addCityInArea("������������� �����", baranovichi);
		nashaBelarasha.addCityInArea("���������� �����", mogilev);
		nashaBelarasha.addCityInArea("��������� �����", shklov);
		nashaBelarasha.addCityInArea("���������� �����", gomel);
		nashaBelarasha.addCityInArea("��������� �����", mozer);
		nashaBelarasha.addCityInArea("����������� �����", grodno);
		nashaBelarasha.addCityInArea("������� �����", lida);
		nashaBelarasha.addCityInArea("��������� �����", vitebsk);
		nashaBelarasha.addCityInArea("��������� �����", orsha);
		
		nashaBelarasha.printInfoState();
		System.out.println();
	}

}