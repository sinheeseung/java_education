package lec04;
import java.util.Scanner;
public class for_prac1 {
//���ڸ� �Է¹޾� �� ���ڱ����� ���� ���ϴ� ���α׷��� �ۼ��Ͽ���.
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int sum = 0;
		for(int i=1;i<=n;i++) {
			sum = sum + i;
		}
		System.out.printf("1���� %d������ ���� %d�Դϴ�.",n,sum);
		input.close();

	}

}
