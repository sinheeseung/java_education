package lec04;
import java.util.Scanner;
public class prac1 {
/*ù° �ٿ��� �� N��, ��° �ٿ��� �� N-1�� , .... 
N��° �ٿ��� �� 1���� ��� ���α׷��� �����Ͽ���. 
	(��, ���� ���������� ���ĵǾ�� �Ѵ�.)*/
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//1.n���� �� ��� => n�� �ݺ�
		//2.���� ��� �ݺ�
		//3.����� ��� �ݺ�
		int n = input.nextInt();
		for(int i=0;i<n;i++) {
			//�� ��� �ݺ�
			//����� ����� ��� ��� ���° �������� ��������
			for(int j=0;j<i;j++)
				//���� ��� �ݺ�(0 ~ n-1)
				System.out.print(" ");
			for(int j=n-i; j>0;j--)
				//����� ��� �ݺ�(n ~ 1)
				System.out.print("*");
			System.out.println();
		}
		input.close();
	}

}
