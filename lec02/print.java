package lec02;

public class print {

	public static void main(String[] args) {
		
		System.out.print("hello\n");
		// 개행을 포함하지 않는 print, 줄바꿈 문자 \n
		
		System.out.println("hello");
		// 자동으로 개행을 포함해주는 println
		
		System.out.printf("%d월 %d일 %s 입니다", 3, 5, "월요일");
		// 형식 지정 출력문 printf
		// 콤마로 출력대상 구분, 형식문자 순서대로 입력

	}

}
