package lec05;

public class arr_lec3 {

	public static void main(String[] args) {
		//�迭�� ����
		int[] arr1;

		//�迭�� ����, �ʱ�ȭ
		arr1 = new int[10];
		System.out.println(arr1[1]);
		//�迭�� ���� �����ϰ� ���� ��
		arr1[1] = 60;
		
		//�迭�� �ε����� �����ؾ� �Ѵ�.
		//�ݺ��� ������ϸ� �����ϴ�.
		System.out.println(arr1[1]);
		
		System.out.println("---------");
		
		System.out.println(arr1.length);
		//�迭�� ���̸� return
		System.out.println(arr1[10]);
		//0������ �迭�� ���۵Ǳ� ������ ũ�Ⱑ 10�� ���
		//0~9�� �ε����� ����
	}

}




