package javaLec.ExCollections.ex18Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx { //�ð��� ������� ������ ����
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>(); //Queue��ü�� �������̽��� ��ü�� �� �����
		queue.add("ȫ�浿");
		queue.add("�Ӳ���");
		queue.add("����");
		queue.add("������");
		while(!queue.isEmpty()){
			System.out.println(queue.remove()); //�̾Ƽ� �����´�
		}
	}
}
