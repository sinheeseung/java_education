package lec03;
import java.util.Scanner;
public class if_prac3 {
//0~100사이의 점수를 입력받아 학점을 구하는 프로그램을 구현하자
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("점수를 입력하세요(0~100) : ");
		int score = input.nextInt();
		if(score >= 0 && score <= 100) {
			if(score >= 90)
				//100~90
				System.out.println("학점은 A입니다.");
			else if(score >= 80)
				//90~80
				System.out.println("학점은 B입니다.");
			else if(score >= 70)
				//80~70
				System.out.println("학점은 C입니다.");
			else
				//70~0
				System.out.println("학점은 F입니다.");
		}
		else
			System.out.println("잘못된 점수를 입력하였습니다.");
		input.close();
	}

}
