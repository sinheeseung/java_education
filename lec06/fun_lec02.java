package lec06;

public class fun_lec02 {

	public static void main(String[] args) {
		int a = 15;
		fun_sum(a);
		//10�̶�� ���� fun_sum�� ��������
	}
	
	public static void fun_sum(int a) {
		//a : �Ű�����
		//main�Լ����� �������� 10�� ���� a�� ����
		
		int sum = 0;
		for(int i=1;i<=a;i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}

}



