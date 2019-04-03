package javaLec.Collections.ex16Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//�ٸ� ������� �����ϰ� ���� �� ����
class YearComparator implements Comparator<PlayerVO>{
	public int compare(PlayerVO p1, PlayerVO p2) {
		return p1.getRegYear() - p2.getRegYear();
	}
}

class PositionComparator implements Comparator<PlayerVO>{
	public int compare(PlayerVO p1, PlayerVO p2) {
		return p1.getPosition().compareTo(p2.getPosition());
	}
}



//Comparable�� default ����
class PlayerVO implements Comparable<PlayerVO>{
	String name; String position; int regYear;
	PlayerVO(String name, String position, int regYear){
		this.name = name;
		this.position = position;
		this.regYear = regYear;
	}
	public String toString() {
		return name+":"+position+":"+regYear;
	}
	public int compareTo(PlayerVO other) {
		System.out.println("���� �õ�");
		return this.name.compareTo(other.name);
	}
	int getRegYear(){
		return this.regYear;
	}
	String getPosition(){
		return this.position;
	}
}
public class PlayerSortTest {
	public static void arraySort() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("AAAA");
		list.add("FFFF");
		list.add("CCCC");
		list.add("1111");
		list.add("ZZZZ");
		list.add("EEEE");
		System.out.println("���� ��");
		System.out.println(list);
		System.out.println("���� ����");
		
		Collections.sort(list);
		System.out.println(list);
		System.out.println("���� ����");
		Collections.reverse(list);
		System.out.println(list);
	}
	
	public static void arrayPlayerVOSort() {
		ArrayList<PlayerVO> list = new ArrayList<PlayerVO>();
		list.add(new PlayerVO("ȫ�浿", "����", 1999));
		list.add(new PlayerVO("�Ӳ���", "����", 2005));
		list.add(new PlayerVO("�ں�ȣ", "1���", 2003));
		list.add(new PlayerVO("��������", "2���", 2010));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
	
	public static void arrayPlayerVOSort2() {
		ArrayList<PlayerVO> list = new ArrayList<PlayerVO>();
		list.add(new PlayerVO("ȫ�浿", "����", 1999));
		list.add(new PlayerVO("�Ӳ���", "����", 2005));
		list.add(new PlayerVO("�ں�ȣ", "1���", 2003));
		list.add(new PlayerVO("��������", "2���", 2010));
		System.out.println(list);
		Comparator comparator = new YearComparator();
		Collections.sort(list);
		System.out.println(list);
	}
	
	public static void arrayPlayerVOSort3() {
		ArrayList<PlayerVO> list = new ArrayList<PlayerVO>();
		list.add(new PlayerVO("ȫ�浿", "����", 1999));
		list.add(new PlayerVO("�Ӳ���", "����", 2005));
		list.add(new PlayerVO("�ں�ȣ", "1���", 2003));
		list.add(new PlayerVO("��������", "2���", 2010));
		System.out.println(list);
		Comparator comparator = new PositionComparator();
		Collections.sort(list);
		System.out.println(list);
	}
	
	public static void main(String[] args) {
		arraySort();
		arrayPlayerVOSort();
		arrayPlayerVOSort2();
		arrayPlayerVOSort3();
	}
}
