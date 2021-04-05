package lec05;

public class arr_lec3 {

	public static void main(String[] args) {
		//배열의 선언
		int[] arr1;

		//배열의 생성, 초기화
		arr1 = new int[10];
		System.out.println(arr1[1]);
		//배열의 값을 수정하고 싶을 때
		arr1[1] = 60;
		
		//배열의 인덱스로 접근해야 한다.
		//반복문 사용해하면 간단하다.
		System.out.println(arr1[1]);
		
		System.out.println("---------");
		
		System.out.println(arr1.length);
		//배열의 길이를 return
		System.out.println(arr1[10]);
		//0번부터 배열이 시작되기 때문에 크기가 10인 경우
		//0~9의 인덱스를 가짐
	}

}




