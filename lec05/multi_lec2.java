package lec05;

public class multi_lec2 {

	public static void main(String[] args) {
		//2���� �迭�� ����
		int[][] arr1;
		//�ڷ���[][] �迭��ü
		int[] arr2[];
		//�ڷ���[] �迭��ü[]

		//2���� �迭�� �ʱ�ȭ
		arr1 = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		arr2 = new int[][] {{10,20,30},{40,50,60},{70,80,90}};

		System.out.println(arr1[1]);
		System.out.println(arr2[1]);
		//2���� �迭�� ��� arr1[]�� �迭�̴�.
		//�迭 ��ü�� �����ϴ� ��� �迭�� �ּ� 
		arr1[1] = arr2[1];
		System.out.println(arr1[1]);
		System.out.println(arr2[1]);
		System.out.println("------------");		
		
		arr2[2][0] = 50;
		System.out.println(arr1[2][0]);
		System.out.println(arr2[2][0]);
		//arr2[1]���� ���� �����ϴ��� arr1[1]�� ���� �ٲ�
		
		
		
		System.out.println("------------");
		arr1[1][1] = 70;
		System.out.println(arr1[1][1]);
		System.out.println(arr2[1][1]);
		//arr1[1]���� ���� �����ϴ��� arr2[1]�� ���� �ٲ�
	}

}


