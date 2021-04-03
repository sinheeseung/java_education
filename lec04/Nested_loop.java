package lec04;

public class Nested_loop {
	public static void main(String[] args) {
		/* 다음 예제는 i = 0 일 때 내부 반복문을 10번 실행하게 된다.
		 * i = 1 일 때 내부 반복문을 다시 10번 실행하게 된다.
		 * i = 2 일 때 내부 반복문을 다시 10번 실행하게 된다.
		 ....총 100번 회전하는 반복문이 된다.*/
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				System.out.print(i + "" + j + " ");
			}
			System.out.println();
		}
	}
}
