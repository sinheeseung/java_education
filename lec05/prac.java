package lec05;
import java.util.Scanner;
public class prac {
//n���� ���ڸ� �Է¹޾� ������ ���ڸ�
//10���� ���� �������� ������ ����Ͽ���. 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//10���� �������� ���� �������� 0~9�� ���̹Ƿ�
		//arr[0~9]�� �� index�� �´� �������� �����ϸ� ���ڴ�!
		//��� ���ٹ���� �̿�
		//150 % 10 = 0 arr[0]++
		//179 % 10 = 9 arr[9]++;
		int n = input.nextInt();
		int arr[] = new int[n];
		//0~n-1�� ���� ������ ũ�Ⱑ n�� �迭�� ����
		for(int i=0;i<n;i++) {
			arr[i] = input.nextInt();
		}
		int arr1[] = new int[10];
		for(int i=0;i<n;i++) {
			int a = arr[i] % 10;
			arr1[a]++;
		}
		for(int i=0;i<10;i++) {
			System.out.printf("�������� %d�� ������ ������ : %d\n", i, arr1[i]);
		}
		
		

	}

}


