package lec06;

import java.util.Scanner;

public class fun_prac {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b;
		char ch;
		System.out.print("��������� �Է��ϼ��� : ");
		a = input.nextInt();
		ch = input.next().charAt(0);
		b = input.nextInt();
		int calc=0;
		if (ch == '+') {
			calc = sum(a, b);
			System.out.printf("%d %c %d = %d�Դϴ�.", a, ch, b, calc);
		} else if (ch == '-') {
			calc = sub(a, b);
			System.out.printf("%d %c %d = %d�Դϴ�.", a, ch, b, calc);
		} else if (ch == '*')
			muti(a, b);
		else if (ch == '/') {
			calc = div(a, b);
			System.out.printf("%d %c %d = %d�Դϴ�.", a, ch, b, calc);
		} else if (ch == '%')
			mod(a, b);
		else
			System.out.printf("�����ڸ� �߸� �Է��Ͽ����ϴ�.");
		input.close();
	}

	static int sum(int a, int b) {
		return a + b;	
	}

	static int sub(int a, int b) {
		return a - b;
	}

	static int div(int a, int b) {
		return a / b;
	}

	static void muti(int a, int b) {
		System.out.printf("%d * %d = %d�Դϴ�.", a, b, a * b);
	}

	static void mod(int a, int b) {
		System.out.printf("%d % %d = %d�Դϴ�.", a, b, a % b);
	}
}
