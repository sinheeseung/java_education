package lec02;
import java.util.Scanner;
//Scanner 클래스 선언
public class input_lec {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//input 객체에 Scanner 기능 부여
		System.out.println(input.nextLine());
		//공백을 포함한 문자열 입력
		System.out.println(input.nextInt());
		//정수 입력
		System.out.println(input.nextDouble());
		//실수 입력
		System.out.println(input.next());
		//공백을 포함하지 않는 문자열 입력
		input.close();
		//Scanner 기능 종료

	
	}

}
