package lec03;
import java.util.Scanner;
public class prac1 {
// switch���� �̿��Ͽ� ��������� �Է¹޾� ����ϴ�
//	 ���α׷��� ����� ����!(+,-,*,/,% ������ ���)
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a,b;
		char ch;
		System.out.print("��������� �Է��ϼ��� : ");
		a = input.nextInt();
		ch = input.next().charAt(0);
		//������
		b = input.nextInt();
		switch(ch) {
		case '+':
			System.out.printf("%d %c %d = %d�Դϴ�.",a,ch,b,a+b);
			break;
		case '-':
			System.out.printf("%d %c %d = %d�Դϴ�.",a,ch,b,a-b);
			break;
		case '*':
			System.out.printf("%d %c %d = %d�Դϴ�.",a,ch,b,a*b);
			break;
		case '/':
			System.out.printf("%d %c %d = %d�Դϴ�.",a,ch,b,a/b);
			break;
		case '%':
			System.out.printf("%d %c %d = %d�Դϴ�.",a,ch,b,a%b);
			break;
		default:
			System.out.printf("�����ڸ� �߸� �Է��Ͽ����ϴ�.");
		}
		input.close();

	}

}
