package lec03;

import java.util.Scanner;

public class prac2 {
// prac1에서 작성한 switch문을 
//	if문으로 변경해보자!
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a,b;
		char ch;
		System.out.print("산술연산을 입력하세요 : ");
		a = input.nextInt();
		ch = input.next().charAt(0);
		//연산자
		b = input.nextInt();
		if(ch == '+')
			System.out.printf("%d %c %d = %d입니다.",a,ch,b,a+b);
		else if(ch == '-')
			System.out.printf("%d %c %d = %d입니다.",a,ch,b,a-b);
		else if(ch == '*')
			System.out.printf("%d %c %d = %d입니다.",a,ch,b,a*b);
		else if(ch == '/')
			System.out.printf("%d %c %d = %d입니다.",a,ch,b,a/b);
		else if(ch == '%')
			System.out.printf("%d %c %d = %d입니다.",a,ch,b,a%b);
		else
			System.out.printf("연산자를 잘못 입력하였습니다.");
		input.close();

	}

}
