import java.util.Arrays;
import java.util.Random;
/*�Ĵ� Class
 * 1)�������� �������� �����Ѵ�.
 * 2)�������� ���� ������ �ȴ�
 * 3)�������� ���� �޼��尡 �ȴ�.
 * 4)������ �Ժη� �����ϸ� ������ ������ �ſ� ����
 *   �׷��� �Ϲ������� ������ ������Ŵ(private)
 *   class �������� ���� ����
 *  5)�޼���� �Ϲ������� �ܺ� ȣ���� ������ ��
 *   �׷��� �Ϲ������� ������ �㰡��(public, default)
 */
class Restaurant{
	//�ʵ�(����): ����
	int money = 100000;
	private String[] foods = { "������", "����", "���", "�̸�" };
	private int sel; //�ʵ庯���� �ڵ����� �ʱ�ȭ��
			
	//�޼���(���): ����		
	void cleaning() {
		System.out.println("�Ĵ��� û���Ѵ�");
	}
	void prepareFoods() {
		System.out.println("���� ��Ḧ �����ϴ�");
	}
	void welcom() {
		System.out.println("�������");
	}
	void byebye() {
		System.out.println("�ȳ��� ������");
	}
	void getMoney(int m) {
		money += m;
		System.out.println(m + "�� ���İ����� ����");
	}
	void calcMoney() {
		System.out.println("���� ���� "+money+" �̴�.");
	}
	void anyFood() {
		System.out.println("� ���� ��Ƿ���?");
		System.out.println(Arrays.toString(foods));
		Random rd = new Random();
		sel = rd.nextInt(foods.length);
		System.out.println(foods[sel]+"�̿�");
	}
	void cookFood() {
		System.out.println(foods[sel]+"�� �丮�ϴ�");
	}
	void sendFood() {
		System.out.println(foods[sel] +" ���Խ��ϴ�");
		System.out.println("���ְ� �弼��!");
	}
}
public class _03_Restaurant {
	
	public static void main(String[] args) {
		//���赵                 ������                  ��ü(��ü)
		Restaurant  rest = new Restaurant ();
		rest.cleaning();
		rest.prepareFoods();
		for(int i=0; i<10;i++) {
			System.out.println("--------------------");
			rest.welcom();
//			if(i ==5) {
//				rest.foods = new String[] {"��","����"}; //private String[] foods���� �ؼ� ���� ������.
//			}
			rest.anyFood();
			rest.cookFood();
			rest.money = -999999999;
			rest.sendFood();
			rest.getMoney(1000);
			rest.byebye();
		}
		rest.calcMoney();
		rest.cleaning();
	}
}