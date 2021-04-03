package lec02;

public class type {
	//변수 선언 및 초기값 설정
	public static void main(String[] args) {
    //  자료형 변수명(임의로 지정) = 초기값
		byte byte_a = 100;
		// -128 ~ 127
		
		short short_a = 30000;
		// -32,768 ~ 32,767
		
		int int_a = 123456789;
		// -2,147,483,648 ~ 2,147,486,647
		
		long long_a = 2147483684l;
		// -2^63 ~ 6^63-1, int의 범위를 넘어가는 경우 숫자뒤에 l사용
		
		float float_a = 100.55f;
		// 32비트 실수형, 숫자뒤에 f표기
		
		double double_a = 100.55;
		//64비트 실수형
		
	    char char_a = 'A';
	    //한 글자만 표현, 작은따옴표 사용
	    
	    String string_a = "motion";
	    //문자열 표현, 큰 따옴표 사용
	    
	    boolean boolean_a = true;
	    //true, false(참, 거짓)의 논리값을 가짐
		
	}

}
