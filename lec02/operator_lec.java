package lec02;
import java.util.Scanner;
//Scanner 클래스 선언
public class operator_lec {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//input 객체에 Scanner 기능 부여
		
		//단항연산자
		int a,b; // 변수 선언
		a = 10; b = 10; //초기값 설정
		
		//a++, ++a => a = a + 1
		System.out.println(a++);
		//후위형 연산자, a 출력 후 +1
		System.out.println(a);
		System.out.println(++a);
		//전위형 연산자, +1 후 a 출력
		
		//b--, -b => b = b - 1
		System.out.println(b--);
		//후위형 연산자, b 출력 후 -1
		System.out.println(b);
		System.out.println(--b);
		//전위형 연산자, -1 후 b 출력
		
		boolean boolean_a; //변수 선언
		boolean_a = true; // 초기값 설정
		
		System.out.println(boolean_a);
		System.out.println(!boolean_a);
		//!연산자는 논리 값을 반전시킴
		
		//이항연산자
		int input_a, input_b;
		//변수 선언
		input_a = input.nextInt();
		input_b = input.nextInt();
		//변수 초기화(정수형 입력)
		
		System.out.println(input_a + input_b);
		//덧셈
		System.out.println(input_a - input_b);
		//뺄셈
		System.out.println(input_a / input_b);
		//나눗셈(몫을 구함)
		System.out.println((double)input_a / input_b);
		//정수 => 실수로 형 변환 후 나눗셈(몫을 구함)
		System.out.println(input_a % input_b);
		//나눗셈(나머지를 구함)
		System.out.println(input_a * input_b);
		//곱셈
		
		input.close();
	}

}
