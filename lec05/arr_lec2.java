package lec05;
public class arr_lec2 {
	public static void main(String[] args) {
		//�迭�� ����
		int[] arr1;
		int arr2[];

		//�迭�� ����, �ʱ�ȭ
		arr1 = new int[6];
		arr2 = new int[] {10,20,30,40,50,60};
		
		System.out.println(arr1);
		System.out.println(arr2);
		//��ü�� �����ϴ� ��� �迭�� �ּ� 
		System.out.println("------------");
		arr1 = arr2;
		//arr1�� �ּҿ� arr2�� �ּҰ� ��������.
		//��, arr1�� arr2�� ���� ���� ����Ű�� �ȴ�.
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println("------------");		
		arr2[2] = 50;
		System.out.println(arr1[2]);
		System.out.println(arr2[2]);
		//arr2���� ���� �����ϴ��� arr1�� ���� �ٲ�
		System.out.println("------------");
		arr1[1] = 70;
		System.out.println(arr1[1]);
		System.out.println(arr2[1]);
		//arr1���� ���� �����ϴ��� arr2�� ���� �ٲ�
	}

}

