package javaLec.ExInterface.ex03_IMP3;
/* ���� ȸ����� mp3�� ����(����)�� ����
 * Bitcamp�� imp3��� interface ��, �Ծ��� ���� �̸� ��� Ŭ������ ��� Test���� ���α׷��� ���ۿ� �� �� �ִ�.
 */
public class MP3TestManager {
	IMP3 mp3; //��������
	
	MP3TestManager(IMP3 mp3){
		setMP3(mp3);
	}
	
	/* ��ƾ �Ŀ﷯�� �̰��� ������ ����(Dependency Injection)
	 * Ŭ���� ���ο��� �������� �ʰ�, �ܺο��� ��ӹ��� �پ��� ��ü�� ������ �� �����Ƿ� ���α׷� ���迡 �������� ������ �� �ִ�. 
	 */
	void setMP3(IMP3 mp3) {
		this.mp3 = mp3;
	}
	
	void allTest(int cnt) throws InterruptedException {
		for(int i=0;i<cnt;i++) {
			System.out.println("****"+mp3+"****");
			mp3.listenFM();
			Thread.sleep(500);
			mp3.playMp3();
			Thread.sleep(500);
			mp3.viewPhoto();
			Thread.sleep(500);
		}
	}
	
	void listenTest() {
		mp3.listenFM();
	}
	
	void playTest() {
		mp3.playMp3();
	}
	
	void viewTest() {
		mp3.viewPhoto();
	}
}
