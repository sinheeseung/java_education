package lec04;
import java.util.Scanner;
public class prac1 {
/*첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개 , .... 
N번째 줄에는 별 1개를 찍는 프로그램을 구현하여라. 
	(단, 별은 오른쪽으로 정렬되어야 한다.)*/
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//1.n개의 줄 출력 => n번 반복
		//2.공백 출력 반복
		//3.별찍기 출력 반복
		int n = input.nextInt();
		for(int i=0;i<n;i++) {
			//줄 출력 반복
			//공백과 별찍기 출력 모두 몇번째 줄인지와 관련있음
			for(int j=0;j<i;j++)
				//공백 출력 반복(0 ~ n-1)
				System.out.print(" ");
			for(int j=n-i; j>0;j--)
				//별찍기 출력 반복(n ~ 1)
				System.out.print("*");
			System.out.println();
		}
		input.close();
	}

}
