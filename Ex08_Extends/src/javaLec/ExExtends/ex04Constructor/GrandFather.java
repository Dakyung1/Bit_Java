package javaLec.ExExtends.ex04Constructor;
/* 아무런 표시가 없는 클래스는 무조건!! java.lang.Object의 상속을 받는다.
 */
public class GrandFather {
	int handsomeScore;
	GrandFather(int score){
		handsomeScore = score;
		System.out.println("GrandFather 생성자");
	}
	void handsome() {
		System.out.println("잘생김 정도가 "+handsomeScore+"로 아주 잘 생겼다");
	}
}
