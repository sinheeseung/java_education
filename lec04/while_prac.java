package lec04;

import java.util.Scanner;

public class while_prac {
//���ڸ� �Է¹޾� �� ���ڱ����� ���� ���ϴ� ���α׷��� �ۼ��Ͽ���.
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int sum = 0, a = 1;//����� ����
		while(a <= n) {//�ݺ��� ���� ����
			sum = sum + a;
			a++;//������
		}
		System.out.printf("1���� %d������ ���� %d�Դϴ�.",n,sum);
		input.close();

	}

}
