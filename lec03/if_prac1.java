package lec03;
import java.util.Scanner;
public class if_prac1 {
/*점수를 입력받아 60점 이상이면 합격, 
	그렇지 않으면 불합격을 출력하는 프로그램을 구현하여라.*/
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		if(a >= 60) {
			System.out.println("합격입니다.");
			System.out.println("축하합니다.");
		}
		else
			System.out.println("불합격입니다.");
			//실행할 내용이 하나인 경우 중괄호 사용하지 않아도됌
		input.close();

	}

}
