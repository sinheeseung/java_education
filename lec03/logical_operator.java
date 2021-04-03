package lec03;

public class logical_operator {

	public static void main(String[] args) {
		int x = 10, y = 20;
		//if뒤에 조건식의 결과가 true면 if블록 내부코드를 실행
		//false이면 else블록의 내부코드 실행
		if((x != 10) & (++y == 21))
			System.out.println("연산결과가 참입니다.");
		else
			System.out.println("연산결과가 거짓입니다.");
		System.out.println("x: " + x + ", y: " + y);
		
		if((x == 10) | (++y == 21))
			System.out.println("연산결과가 참입니다.");
		else
			System.out.println("연산결과가 거짓입니다.");
		System.out.println("x: " + x + ", y: " + y);
		
		
		System.out.println("-------------------------------");
		int a=10,b=20;
		if((a != 10) && (++b == 21))//뒤는 실행조차 하지 않았다는걸 알 수 있다.
			System.out.println("연산결과가 참입니다.");
		else
			System.out.println("연산결과가 거짓입니다.");
		System.out.println("a: " + a + ", b: " + b);
		
		if((a == 10) || (++b == 21))//뒤는 실행조차 하지 않았다는걸 알 수 있다.
			System.out.println("연산결과가 참입니다.");
		else
			System.out.println("연산결과가 거짓입니다.");
		System.out.println("a: " + a + ", b: " + b);

	}

}
