package lec05;


public class multi_lec_prac {
//구구단 1~9단을 출력하는 프로그램을 구현해라
	public static void main(String[] args) {
		int[][] arr = new int[9][9];
		//2차원 배열의 선언과 생성
		//구구단을 저장할 배열
		for (int i = 1; i <= 9; i++) {
			//1 ~ 9단까지 반복 9번
			for (int j = 1; j <= 9; j++) {
				// i단의 구구단 완성 1~9 
				arr[i-1][j-1] = i * j;
				//배열 값 입력 0번째 방부터 시작합니다.
			}
		}
		for (int i = 1; i <= 9; i++) {
			//9*9 9번
			System.out.printf("%d단 : ",i);
			for (int j = 1; j <= 9; j++) {
				//9번
				System.out.print(arr[i-1][j-1] +" ");
				//배열 값 출력
			}
			System.out.println();
		}

	}

}



