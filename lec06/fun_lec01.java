package lec06;

public class fun_lec01 {
	//��ȯ ����(return)
	public static void main(String[] args) {
		fun_sum1();
		int a = fun_sum2();
		//�޼ҵ��� ȣ��
		System.out.println("sum2�Լ��� ����Դϴ�.");
		System.out.println(a);
	}
	public static void fun_sum1() {
		//void �ڷ����� return���� ��ȯ���� ���� 
		int sum = 0;
		for(int i=1;i<=10;i++) {
			sum = sum + i;
		}
		System.out.println("sum1�Լ��� ����Դϴ�.");
		System.out.println(sum);
		//�ڵ� ������ ����� �Լ� ���ο��� ó���Ǿ�� �Ѵ�.
	}
	public static int fun_sum2() {
		//��ȯ����(�ڷ���)�� int�̹Ƿ� int���� return�ؾ��� 
		int sum = 0;
		for(int i=1;i<=10;i++) {
			sum = sum + i;
		}
		return sum;
		//�Լ������� ����� ��ȯ������ ���� main�̳� ȣ���� �Լ��� ���� �� �� �ִ�.
	}

}
