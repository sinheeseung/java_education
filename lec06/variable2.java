package lec06;

public class variable2 {
	//지역변수
	public static void main(String[] args) {
		int a;
		a = 50;

	}
	static void print() {
		print(a);
		//a가 main 함수에서 작성된
		//지역변수이므로 print함수에서는 사용 불가
	}

}


