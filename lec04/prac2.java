package lec04;
import java.util.Scanner;
public class prac2 {
//���ڸ� �Է¹޾� �� ���ڱ��� �Ҽ��� ����� Ȯ���ϴ� ���α׷��� �����Ͽ���.
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//1. 1~n������ �ݺ�
		//2. �Ҽ� ���ϴ� �ݺ�
		int n = input.nextInt();
		int a=0, cnt = 0;
		//a�� �Ҽ��� ������ ����
		//cnt�� �� ���� ����� ���� ����
		for(int i=1;i<=n;i++) {
			cnt = 0;
			//�� ������ ����� ������ ���ؾ� �ϹǷ� �ʱ�ȭ
			for(int j=1;j<=i;j++) {
				if(i % j == 0) cnt++;
			}
			//i�� ���� ����� ���� ����
			if(cnt == 2)
				//i�� �Ҽ��� ���
				a++;
		}
		System.out.println("1���� " +n+"������ ���� �߿� �Ҽ��� " +a+"�� �Դϴ�.");
		input.close();
	}

}
