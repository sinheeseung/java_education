package lec06;

public class fun_lec03 {
	// 50������ ¦���� ���ϴ� ���α׷�
	public static void main(String[] args) {
		
		fun_01();
		//�Ű������� return�� ���� �Լ�
		
		int fun2 = fun_02();
		//return���� �ִ� �Լ�
		System.out.println("return���� �ִ� �Լ��Դϴ�.");
		System.out.println(fun2);
		System.out.println("-------------------------------");
		
		fun_03(50,2);
		//�Ű������� �ִ� �Լ�
		
		int fun4 = fun_04(50,2);
		//�Ű������� return�� �ִ� �Լ�
		System.out.println("�Ű������� return���� �ִ� �Լ��Դϴ�.");
		System.out.println(fun4);
		System.out.println("-------------------------------");
	}

	static void fun_01() {
		//�Ű������� return�� ���� �Լ�
		int sum = 0;
		//sum ���� �����ϴ� ����
		for(int i=0;i<=50;i=i+2) {
			sum = sum + i;
		}
		System.out.println("�Ű������� return���� ���� �Լ��Դϴ�.");
		System.out.println(sum);
		System.out.println("-------------------------------");
	}

	static int fun_02() {
		//return���� �ִ� �Լ�
		int sum = 0;
		for(int i=0;i<=50;i=i+2) {
			sum = sum + i;
		}	
		return sum;
	}

	static void fun_03(int a/*50*/, int b/*2*/) {
		//�Ű������� �ִ� �Լ�
		int sum = 0;
		for(int i=0;i<=a;i=i+b) {
			sum = sum + i;
		}
		System.out.println("�Ű������� �ִ� �Լ��Դϴ�.");
		System.out.println(sum);
		System.out.println("-------------------------------");
	}

	static int fun_04(int a, int b) {
		//�Ű������� return�� �ִ� �Լ�
		int sum = 0;
		for(int i=0;i<=a;i=i+b) {
			sum = sum + i;
		}
		return sum;
	}

}
