package lec05;

public class arr_lec {

	public static void main(String[] args) {
//      1차원 배열의 선언
//		자료형[] 배열객체;
		int[] arr1;
//		자료형 배열객체[];
		int arr2[];
		
		//1차원 배열의 초기화
		arr1 = new int[6];
		//선언과 별개로 초기화 할 수 있음, 0값으로 초기화
		//arr1[0] ,arr1[1],arr1[2],arr1[3],arr1[4],arr1[5]
		
		arr2 = new int[] {10,20,30,40,50,60};
		//선언과 별개로 초기화 할 수 있음
		//arr2[0] ,arr2[1],arr2[2],arr2[3],arr2[4],arr2[5]
		
		//선언과 동시에 초기화
		int[] arr3 = {0,1,2,3,4,5};
		//arr3[0] ,arr3[1],arr3[2],arr3[3],arr3[4],arr3[5]
		
		System.out.println(arr1[0]);
		System.out.println(arr2[1]);
		System.out.println(arr3[2]);

	}

}

