package lec03;
import java.util.Scanner;
public class prac1 {
// switch문을 이용하여 산술연산을 입력받아 계산하는
//	 프로그램을 만들어 보자!(+,-,*,/,% 연산자 사용)
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a,b;
		char ch;
		System.out.print("산술연산을 입력하세요 : ");
		a = input.nextInt();
		ch = input.next().charAt(0);
		//연산자
		b = input.nextInt();
		switch(ch) {
		case '+':
			System.out.printf("%d %c %d = %d입니다.",a,ch,b,a+b);
			break;
		case '-':
			System.out.printf("%d %c %d = %d입니다.",a,ch,b,a-b);
			break;
		case '*':
			System.out.printf("%d %c %d = %d입니다.",a,ch,b,a*b);
			break;
		case '/':
			System.out.printf("%d %c %d = %d입니다.",a,ch,b,a/b);
			break;
		case '%':
			System.out.printf("%d %c %d = %d입니다.",a,ch,b,a%b);
			break;
		default:
			System.out.printf("연산자를 잘못 입력하였습니다.");
		}
		input.close();

	}

}
