package lec02;
import java.util.Scanner;
//Scanner Ŭ���� ����
public class input_lec {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//input ��ü�� Scanner ��� �ο�
		System.out.println(input.nextLine());
		//������ ������ ���ڿ� �Է�
		System.out.println(input.nextInt());
		//���� �Է�
		System.out.println(input.nextDouble());
		//�Ǽ� �Է�
		System.out.println(input.next());
		//������ �������� �ʴ� ���ڿ� �Է�
		input.close();
		//Scanner ��� ����

	
	}

}
