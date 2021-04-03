package lec03;

public class operator2_lec {

	public static void main(String[] args) {
		
		//비교연산자, 크기 값을 비교하여 조건은 만족하면 true, 그렇지 않으면 false
		int a,b;
		a = 5; b = 10;
		System.out.println(a > b);
		//a가 b보다 크다
		System.out.println(a >= b);
		//a가 b보다 크거나 같다
		System.out.println(a < b);
		//a가 b보다 작다
		System.out.println(a <= b);
		//a가 b보다 작거나 같다
		System.out.println(a == b);
		//a와 b가 같다
		System.out.println(a != b);
		//a와 b가 같지않다.
		
		//비트 연산자
		int c,d;
		c = 20; d = 63;
		System.out.println(Integer.toBinaryString(c));
		//c를 이진수로 출력
		System.out.println(Integer.toBinaryString(d));
		//d를 이진수로 출력
		System.out.println(Integer.toBinaryString(d<<2));
		//d의 비트를 왼쪽으로 2칸 이동
		System.out.println(Integer.toBinaryString(d>>2));
		//d의 비트를 오른쪽으로 2칸 이동
		System.out.println(Integer.toBinaryString(c&d));
		//c와 d의 비트곱
		System.out.println(Integer.toBinaryString(c|d));
		//c와 d의 비트합
		System.out.println(Integer.toBinaryString(c^b));
		//c와 d의 베타적 논리합
		
		//삼항연산자
		int e = 10;
		String result = e %2 == 0 ? "짝수" : "홀수";
		//조건식이 참인경우 왼쪽 그렇지않으면 오른쪽을 실행함
		System.out.println(result);
	}

}
