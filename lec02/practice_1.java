package lec02;
import java.util.Scanner;
//Scanner 클래스 선언
public class practice_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//input 객체에 Scanner 기능 부여
		
		int month,day;
		String week;
		//변수 선언
		
		month = input.nextInt();
		day = input.nextInt();
		week = input.next();
		//Scanner를 통한 변수 초기화
		
		System.out.printf("%d월 %d일 %s입니다.\n", month, day, week);
		
		System.out.println(month +"월 " + day + "일 "+week+"입니다.");
		//+를 이용한 출력
		input.close();
	}

}
