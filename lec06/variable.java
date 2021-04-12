package lec06;

public class variable {
	//전역변수
	static int a;
	//전역변수 값을 할당하지 않아도 default값 0으로 초기화 되어있다. 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(a);
		System.out.println("-----------");
		print();
	}
	
	static void print() {
		//클래스 내 모든 메소드에서 사용 가능
		System.out.println(a);
	}


}

