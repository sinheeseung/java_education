package lec05;

import java.util.Scanner;

public class arr_prac1 {
//n���� ���ڸ� �Է¹޾� �ּڰ��� �ִ��� ���ϴ� ���α׷���
//�ۼ��Ͽ���. �Էµ� ������ ������(0~100)
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		//n���� ���� �Է�
		int[] arr = new int[n];
		//0~n-1�� �ε����� ������ ũ��n�� �迭 ����
		for(int i=0;i<n;i++) {
			//n���� ���ڸ� �Է� �����Ƿ� n�� �ݺ��ϴ� �ݺ���
			//�迭�� �ε����� 0������ �����̹Ƿ� ������� ���� 0���� ����
			arr[i] = input.nextInt();
		}
		//�迭�� �Է°��� ��� �Է¹޾ҽ��ϴ�.
		
		int max = -1, min = 101;
		//max�� min�� ���� ������ arr[0~n-1]�����մϴ�.
		
		//�ִ�, �ּҰ� �ʱ�ȭ
		for(int i=0;i<n;i++) {
			//�迭�� ��� ���Ҹ� Ȯ���ϸ鼭 �˻� ����
			if(arr[i] > max) max = arr[i];
			if(arr[i] < min) min = arr[i];
		}
		System.out.printf("�ִ��� %d�Դϴ�.\n",max);
		System.out.printf("�ּڰ��� %d�Դϴ�.",min);
	}

}




