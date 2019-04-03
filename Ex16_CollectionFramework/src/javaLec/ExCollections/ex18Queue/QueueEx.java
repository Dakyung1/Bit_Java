package javaLec.ExCollections.ex18Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx { //시간의 순서대로 나오는 구조
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>(); //Queue자체는 인터페이스라서 객체로 못 만든다
		queue.add("홍길동");
		queue.add("임꺽정");
		queue.add("장길산");
		queue.add("일지매");
		while(!queue.isEmpty()){
			System.out.println(queue.remove()); //뽑아서 꺼내온다
		}
	}
}
