package lec06;

public class fun_lec03 {
	// 50까지의 짝수만 더하는 프로그램
	public static void main(String[] args) {
		
		fun_01();
		//매개변수와 return값 없는 함수
		
		int fun2 = fun_02();
		//return값만 있는 함수
		System.out.println("return값만 있는 함수입니다.");
		System.out.println(fun2);
		System.out.println("-------------------------------");
		
		fun_03(50,2);
		//매개변수만 있는 함수
		
		int fun4 = fun_04(50,2);
		//매개변수와 return값 있는 함수
		System.out.println("매개변수와 return값이 있는 함수입니다.");
		System.out.println(fun4);
		System.out.println("-------------------------------");
	}

	static void fun_01() {
		//매개변수와 return값 없는 함수
		int sum = 0;
		//sum 합을 저장하는 변수
		for(int i=0;i<=50;i=i+2) {
			sum = sum + i;
		}
		System.out.println("매개변수와 return값이 없는 함수입니다.");
		System.out.println(sum);
		System.out.println("-------------------------------");
	}

	static int fun_02() {
		//return값만 있는 함수
		int sum = 0;
		for(int i=0;i<=50;i=i+2) {
			sum = sum + i;
		}	
		return sum;
	}

	static void fun_03(int a/*50*/, int b/*2*/) {
		//매개변수만 있는 함수
		int sum = 0;
		for(int i=0;i<=a;i=i+b) {
			sum = sum + i;
		}
		System.out.println("매개변수만 있는 함수입니다.");
		System.out.println(sum);
		System.out.println("-------------------------------");
	}

	static int fun_04(int a, int b) {
		//매개변수와 return값 있는 함수
		int sum = 0;
		for(int i=0;i<=a;i=i+b) {
			sum = sum + i;
		}
		return sum;
	}

}
