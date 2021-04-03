package lec04;
import java.util.Scanner;
public class Nested_prac {
//숫자를 입력받아 첫째 줄에는 별 1개, 둘째 줄에는 별 2개,
//N번째 줄에는 별 N개를 찍는 프로그램을 구현하여라
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++)
				System.out.print("*");
			System.out.println();
		}
		input.close();
		

	}

}
