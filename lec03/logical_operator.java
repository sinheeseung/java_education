package lec03;

public class logical_operator {

	public static void main(String[] args) {
		int x = 10, y = 20;
		//if�ڿ� ���ǽ��� ����� true�� if��� �����ڵ带 ����
		//false�̸� else����� �����ڵ� ����
		if((x != 10) & (++y == 21))
			System.out.println("�������� ���Դϴ�.");
		else
			System.out.println("�������� �����Դϴ�.");
		System.out.println("x: " + x + ", y: " + y);
		
		if((x == 10) | (++y == 21))
			System.out.println("�������� ���Դϴ�.");
		else
			System.out.println("�������� �����Դϴ�.");
		System.out.println("x: " + x + ", y: " + y);
		
		
		System.out.println("-------------------------------");
		int a=10,b=20;
		if((a != 10) && (++b == 21))//�ڴ� �������� ���� �ʾҴٴ°� �� �� �ִ�.
			System.out.println("�������� ���Դϴ�.");
		else
			System.out.println("�������� �����Դϴ�.");
		System.out.println("a: " + a + ", b: " + b);
		
		if((a == 10) || (++b == 21))//�ڴ� �������� ���� �ʾҴٴ°� �� �� �ִ�.
			System.out.println("�������� ���Դϴ�.");
		else
			System.out.println("�������� �����Դϴ�.");
		System.out.println("a: " + a + ", b: " + b);

	}

}
