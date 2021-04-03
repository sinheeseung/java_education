package lec04;

public class while_lec {
	public static void main(String[] args) {
		//continue
		int i = 0, sum = 0;
		while(i < 10) {
			i++;
			if(i % 2 == 0)
				continue;
			System.out.println(i);
			sum = sum + i;
		}
		System.out.println(sum);
		//i % 2 == 0인 경우, 즉 i가 짝수인 경우
		//반복문에 있는 continue아래 문장이 실행되지 않고
		//다음 반복으로 넘어간 것을 알 수 있음
		
		
		//break
		i = 0;
		while(true) {
			i++;
			if(i > 100) break;
			System.out.println(i);
		}
		//조건이 true로 무한loop임에도
		//i가 100보다 커진 경우 break를 통해 반목문을 벗어나는 것을 알 수 있음
		
		//while
		int a = 10;
		while(a < 10) {
			System.out.println("a는 10보다 작습니다.");
			a++;
		}
		System.out.println("프로그램이 종료되었습니다.");
		
		//do while
	    a = 10;
		do{
			System.out.println("a는 10보다 작습니다.");
			a++;
		}while(a < 10);
		System.out.println("프로그램이 종료되었습니다.");
		
		//조건이 만족하지 않아도 do-while의 경우 최소 한번은
		//반복을 실행하는 것을 알 수 있음
	}
}
