package lec04;
import java.util.Scanner;
public class prac2 {
//숫자를 입력받아 그 숫자까지 소수가 몇개인지 확인하는 프로그램을 구현하여라.
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//1. 1~n까지의 반복
		//2. 소수 구하는 반복
		int n = input.nextInt();
		int a=0, cnt = 0;
		//a는 소수의 개수를 저장
		//cnt는 각 수의 약수의 개수 저장
		for(int i=1;i<=n;i++) {
			cnt = 0;
			//각 수마다 약수의 개수를 구해야 하므로 초기화
			for(int j=1;j<=i;j++) {
				if(i % j == 0) cnt++;
			}
			//i에 대한 약수의 수를 구함
			if(cnt == 2)
				//i가 소수인 경우
				a++;
		}
		System.out.println("1부터 " +n+"까지의 숫자 중에 소수는 " +a+"개 입니다.");
		input.close();
	}

}
