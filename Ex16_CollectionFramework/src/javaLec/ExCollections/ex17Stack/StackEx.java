package javaLec.ExCollections.ex17Stack;

import java.util.Stack;

public class StackEx {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		for(int i=0; i<10;i++) { //�� �� 0����
			s.push(i);
		}
		System.out.println();
		for(int i=0;i<10;i++) { //���� �� 9����
			System.out.println(s.pop());
		}
	}
}
