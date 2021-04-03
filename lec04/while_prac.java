package lec04;

import java.util.Scanner;

public class while_prac {
//숫자를 입력받아 그 숫자까지의 합을 구하는 프로그램을 작성하여라.
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int sum = 0, a = 1;//제어변수 설정
		while(a <= n) {//반복문 조건 설정
			sum = sum + a;
			a++;//증감식
		}
		System.out.printf("1부터 %d까지의 합은 %d입니다.",n,sum);
		input.close();

	}

}
