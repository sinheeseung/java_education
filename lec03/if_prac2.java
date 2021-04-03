package lec03;
import java.util.Scanner;
public class if_prac2 {
//정수를 입력받아 양수인지, 음수인지, 0인지 알아내는 프로그램을 구현하여라.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		if(a > 0)
			System.out.println("a는 양수입니다.");
		else if(a < 0)
			System.out.println("a는 음수입니다.");
		else
			System.out.println("a는 0입니다.");
		input.close();

	}

}
