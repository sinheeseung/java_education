package lec02;

public class String_lec {

	public static void main(String[] args) {
		String String_a = "my name is heeseung";
		
		System.out.println(String_a);
		//���ڿ� ���
		System.out.println(String_a.length());
		//�־��� ���ڿ��� ���̸� ���
		System.out.println(String_a.charAt(0));
		//������ index�� ���ڸ���ȯ, ���ڿ��� index�� 0������ ����
		System.out.println(String_a.indexOf("h"));
		//���ڿ����� Ư�� ���ڰ� ���۵Ǵ� index��ȯ
		System.out.println(String_a.substring(11,19));
		//���ڿ� �� Ư�� �κ� ���ĸ� �̾Ƴ�, �޸��� ���� �������� ���� ����
		System.out.println(String_a.replaceAll("heeseung", "hongseok"));
		//Ư�� ���ڸ� ���ϴ� ���ڷ� ����

	}

}
