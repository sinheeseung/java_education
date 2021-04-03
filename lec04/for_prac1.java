package lec04;
import java.util.Scanner;
public class for_prac1 {
//숫자를 입력받아 그 숫자까지의 합을 구하는 프로그램을 작성하여라.
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int sum = 0;
		for(int i=1;i<=n;i++) {
			sum = sum + i;
		}
		System.out.printf("1부터 %d까지의 합은 %d입니다.",n,sum);
		input.close();

	}

}
