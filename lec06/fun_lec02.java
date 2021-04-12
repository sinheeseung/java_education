package lec06;

public class fun_lec02 {

	public static void main(String[] args) {
		int a = 15;
		fun_sum(a);
		//10이라는 값을 fun_sum에 전달해줌
	}
	
	public static void fun_sum(int a) {
		//a : 매개변수
		//main함수에서 전달해준 10의 값을 a로 받음
		
		int sum = 0;
		for(int i=1;i<=a;i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}

}



