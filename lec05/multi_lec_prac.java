package lec05;


public class multi_lec_prac {
//������ 1~9���� ����ϴ� ���α׷��� �����ض�
	public static void main(String[] args) {
		int[][] arr = new int[9][9];
		//2���� �迭�� ����� ����
		//�������� ������ �迭
		for (int i = 1; i <= 9; i++) {
			//1 ~ 9�ܱ��� �ݺ� 9��
			for (int j = 1; j <= 9; j++) {
				// i���� ������ �ϼ� 1~9 
				arr[i-1][j-1] = i * j;
				//�迭 �� �Է� 0��° ����� �����մϴ�.
			}
		}
		for (int i = 1; i <= 9; i++) {
			//9*9 9��
			System.out.printf("%d�� : ",i);
			for (int j = 1; j <= 9; j++) {
				//9��
				System.out.print(arr[i-1][j-1] +" ");
				//�迭 �� ���
			}
			System.out.println();
		}

	}

}



