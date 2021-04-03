package lec02;

public class String_lec {

	public static void main(String[] args) {
		String String_a = "my name is heeseung";
		
		System.out.println(String_a);
		//문자열 출력
		System.out.println(String_a.length());
		//주어진 문자열의 길이를 출력
		System.out.println(String_a.charAt(0));
		//지정한 index의 문자를반환, 문자열의 index는 0번부터 시작
		System.out.println(String_a.indexOf("h"));
		//문자열에서 특정 문자가 시작되는 index반환
		System.out.println(String_a.substring(11,19));
		//문자열 중 특정 부분 이후를 뽑아냄, 콤마를 통해 종료지점 설정 가능
		System.out.println(String_a.replaceAll("heeseung", "hongseok"));
		//특정 문자를 원하는 문자로 변경

	}

}
