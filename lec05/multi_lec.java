package lec05;

public class multi_lec {

	public static void main(String[] args) {
		//2���� �迭�� ����
		int[][] arr1;
		//�ڷ���[][] �迭��ü
		int[] arr2[];
		//�ڷ���[] �迭��ü[]
		int arr3[][];
		//�ڷ��� �迭��ü[][]
		
		//2���� �迭�� �ʱ�ȭ
		arr1 = new int[3][3];
		arr2 = new int[][] {{10,20,30},{40,50,60},{70,80,90}};

		//����� ���ÿ� �ʱ�ȭ
		int[][] arr4 = {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println(arr1[0][0]);
		System.out.println(arr2[1][1]);
		System.out.println(arr4[2][2]);
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}

	}

}
