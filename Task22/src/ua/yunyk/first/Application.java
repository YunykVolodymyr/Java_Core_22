package ua.yunyk.first;

interface Pet {
	public void voice();
}

public class Application {

	public static void main(String[] args) {

		Pet cat = () -> System.out.println("� ��- �����-�����");
		Pet dog = () -> System.out.println("� ��� - �����-�����");
		Pet cow = () -> System.out.println("� ������- ����-����");

		cat.voice();
		dog.voice();
		cow.voice();

	}

}
