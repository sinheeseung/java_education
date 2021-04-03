package lec04;
import java.util.Scanner;
public class for_prac2 {
//숫자를 입력받아 그 숫자가 소수인지 구하는 프로그램을 작성하여라.
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int cnt=0;
		for(int i=1;i<=n;i++) {
			if(n % i == 0)
				cnt++;
		}
		if(cnt == 2)
			System.out.println(n +"은 소수입니다.");
		else
			System.out.println(n + "은 소수가 아닙니다.");
		input.close();

	}

}
