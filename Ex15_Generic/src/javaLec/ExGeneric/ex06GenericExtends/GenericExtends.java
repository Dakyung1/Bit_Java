package javaLec.ExGeneric.ex06GenericExtends;

class AAA<T>{
	T itemAAA;
	AAA(T item){
		itemAAA = item;
	}
	void showItem() {
		System.out.println(itemAAA);
	}
}

class BBB<T> extends AAA<T>{
	T itemBBB;
	BBB(T itemA, T itemB){
		super(itemA);
		itemBBB = itemB;
	}
	
	void showItem() {
		super.showItem();
		System.out.println(itemBBB);
	}
}
class CCC extends AAA<String>{
	int itemCCC;
	CCC(String str){
		super(str);
	}
}

public class GenericExtends {
	public static void main(String[] args) {
		BBB<String> myString = new BBB<String>("ȫ�浿", "�Ӳ���");
		BBB<Integer> myInteger = new BBB<Integer>(24,28);
		myString.showItem();
		myInteger.showItem();
	}
}
