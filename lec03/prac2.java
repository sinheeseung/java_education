package lec03;

import java.util.Scanner;

public class prac2 {
// prac1���� �ۼ��� switch���� 
//	if������ �����غ���!
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a,b;
		char ch;
		System.out.print("��������� �Է��ϼ��� : ");
		a = input.nextInt();
		ch = input.next().charAt(0);
		//������
		b = input.nextInt();
		if(ch == '+')
			System.out.printf("%d %c %d = %d�Դϴ�.",a,ch,b,a+b);
		else if(ch == '-')
			System.out.printf("%d %c %d = %d�Դϴ�.",a,ch,b,a-b);
		else if(ch == '*')
			System.out.printf("%d %c %d = %d�Դϴ�.",a,ch,b,a*b);
		else if(ch == '/')
			System.out.printf("%d %c %d = %d�Դϴ�.",a,ch,b,a/b);
		else if(ch == '%')
			System.out.printf("%d %c %d = %d�Դϴ�.",a,ch,b,a%b);
		else
			System.out.printf("�����ڸ� �߸� �Է��Ͽ����ϴ�.");
		input.close();

	}

}
