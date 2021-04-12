package lec06;

public class fun_lec {

	public static void main(String[] args) {
		/*함수를 사용하면 코드를 재사용하지 않고 함수를
		  호출하면서 코드를 간단화 시킬 수 있다*/
		
		fun_sum();
		//메소드의 호출
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//
		fun_sum();
		//메소드의 호출

	}
	//메소드의 선언
	static void fun_sum() {
		//public 접근제어형식, static : 부가적형식
		//void 자료형, fun_sum : 메소드 이름, () : 매개변수
		//void 자료형은 return값을 반환하지 않음 
		
		//body
		int sum = 0;
		for(int i=1;i<=10;i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public static void main(String[] args) {
	/*함수를 사용하지 않는다면 아래의 코드를 재사용
	  하기 위해서는 같은 코드를 반복 시켜야 한다.
	
	int sum_1 = 0;
	for(int i=1;i<=10;i++) {
		sum_1 = sum_1 + i;
	}
	System.out.println(sum_1);
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//
	int sum_2 = 0;
	for(int i=1;i<=10;i++) {
		sum_2 = sum_2 + i;
	}
	System.out.println(sum_2);

}*/
}

