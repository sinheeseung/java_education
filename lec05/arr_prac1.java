package lec05;

import java.util.Scanner;

public class arr_prac1 {
//n개의 숫자를 입력받아 최솟값과 최댓값을 구하는 프로그램을
//작성하여라. 입력된 숫자의 범위가(0~100)
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		//n개의 숫자 입력
		int[] arr = new int[n];
		//0~n-1의 인덱스를 가지는 크기n인 배열 생성
		for(int i=0;i<n;i++) {
			//n개의 숫자를 입력 받으므로 n번 반복하는 반복문
			//배열의 인덱스가 0번부터 시작이므로 제어변수의 값을 0으로 설정
			arr[i] = input.nextInt();
		}
		//배열에 입력값을 모두 입력받았습니다.
		
		int max = -1, min = 101;
		//max와 min의 값은 무조건 arr[0~n-1]존재합니다.
		
		//최대, 최소값 초기화
		for(int i=0;i<n;i++) {
			//배열의 모든 원소를 확인하면서 검사 진행
			if(arr[i] > max) max = arr[i];
			if(arr[i] < min) min = arr[i];
		}
		System.out.printf("최댓값은 %d입니다.\n",max);
		System.out.printf("최솟값은 %d입니다.",min);
	}

}




