package lec05;
import java.util.Scanner;
public class prac {
//n개의 숫자를 입력받아 각각의 숫자를
//10으로 나눈 나머지의 갯수를 출력하여라. 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//10으로 나누었을 때의 나머지는 0~9의 값이므로
		//arr[0~9]의 각 index에 맞는 나머지를 저장하면 좋겠다!
		//라는 접근방법을 이용
		//150 % 10 = 0 arr[0]++
		//179 % 10 = 9 arr[9]++;
		int n = input.nextInt();
		int arr[] = new int[n];
		//0~n-1의 방을 가지는 크기가 n인 배열을 생성
		for(int i=0;i<n;i++) {
			arr[i] = input.nextInt();
		}
		int arr1[] = new int[10];
		for(int i=0;i<n;i++) {
			int a = arr[i] % 10;
			arr1[a]++;
		}
		for(int i=0;i<10;i++) {
			System.out.printf("나머지가 %d인 숫자인 갯수는 : %d\n", i, arr1[i]);
		}
		
		

	}

}


