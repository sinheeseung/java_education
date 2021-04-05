package lec05;
public class arr_lec2 {
	public static void main(String[] args) {
		//배열의 선언
		int[] arr1;
		int arr2[];

		//배열의 생성, 초기화
		arr1 = new int[6];
		arr2 = new int[] {10,20,30,40,50,60};
		
		System.out.println(arr1);
		System.out.println(arr2);
		//객체로 접근하는 경우 배열의 주소 
		System.out.println("------------");
		arr1 = arr2;
		//arr1의 주소와 arr2의 주소가 같아진다.
		//즉, arr1과 arr2가 같은 값을 가리키게 된다.
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println("------------");		
		arr2[2] = 50;
		System.out.println(arr1[2]);
		System.out.println(arr2[2]);
		//arr2에서 값을 수정하더라도 arr1의 값도 바뀜
		System.out.println("------------");
		arr1[1] = 70;
		System.out.println(arr1[1]);
		System.out.println(arr2[1]);
		//arr1에서 값을 수정하더라도 arr2의 값도 바뀜
	}

}

