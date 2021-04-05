package lec05;

public class multi_lec {

	public static void main(String[] args) {
		//2차원 배열의 선언
		int[][] arr1;
		//자료형[][] 배열객체
		int[] arr2[];
		//자료형[] 배열객체[]
		int arr3[][];
		//자료형 배열객체[][]
		
		//2차원 배열의 초기화
		arr1 = new int[3][3];
		arr2 = new int[][] {{10,20,30},{40,50,60},{70,80,90}};

		//선언과 동시에 초기화
		int[][] arr4 = {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println(arr1[0][0]);
		System.out.println(arr2[1][1]);
		System.out.println(arr4[2][2]);
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}

	}

}
