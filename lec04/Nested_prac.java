package lec04;
import java.util.Scanner;
public class Nested_prac {
//���ڸ� �Է¹޾� ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��,
//N��° �ٿ��� �� N���� ��� ���α׷��� �����Ͽ���
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++)
				System.out.print("*");
			System.out.println();
		}
		input.close();
		

	}

}
