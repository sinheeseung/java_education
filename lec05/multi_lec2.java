package lec05;

public class multi_lec2 {

	public static void main(String[] args) {
		//2차원 배열의 선언
		int[][] arr1;
		//자료형[][] 배열객체
		int[] arr2[];
		//자료형[] 배열객체[]

		//2차원 배열의 초기화
		arr1 = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		arr2 = new int[][] {{10,20,30},{40,50,60},{70,80,90}};

		System.out.println(arr1[1]);
		System.out.println(arr2[1]);
		//2차원 배열의 경우 arr1[]도 배열이다.
		//배열 객체로 접근하는 경우 배열의 주소 
		arr1[1] = arr2[1];
		System.out.println(arr1[1]);
		System.out.println(arr2[1]);
		System.out.println("------------");		
		
		arr2[2][0] = 50;
		System.out.println(arr1[2][0]);
		System.out.println(arr2[2][0]);
		//arr2[1]에서 값을 수정하더라도 arr1[1]의 값도 바뀜
		
		
		
		System.out.println("------------");
		arr1[1][1] = 70;
		System.out.println(arr1[1][1]);
		System.out.println(arr2[1][1]);
		//arr1[1]에서 값을 수정하더라도 arr2[1]의 값도 바뀜
	}

}


