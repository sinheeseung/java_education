package lec06;

public class fun_lec01 {
	//반환 유형(return)
	public static void main(String[] args) {
		fun_sum1();
		int a = fun_sum2();
		//메소드의 호출
		System.out.println("sum2함수의 결과입니다.");
		System.out.println(a);
	}
	public static void fun_sum1() {
		//void 자료형은 return값을 반환하지 않음 
		int sum = 0;
		for(int i=1;i<=10;i++) {
			sum = sum + i;
		}
		System.out.println("sum1함수의 결과입니다.");
		System.out.println(sum);
		//코드 실행의 결과가 함수 내부에서 처리되어야 한다.
	}
	public static int fun_sum2() {
		//반환유형(자료형)이 int이므로 int값을 return해야함 
		int sum = 0;
		for(int i=1;i<=10;i++) {
			sum = sum + i;
		}
		return sum;
		//함수실행의 결과과 반환유형을 통해 main이나 호출한 함수로 전달 될 수 있다.
	}

}
