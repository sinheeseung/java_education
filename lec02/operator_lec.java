package lec02;
import java.util.Scanner;
//Scanner Ŭ���� ����
public class operator_lec {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//input ��ü�� Scanner ��� �ο�
		
		//���׿�����
		int a,b; // ���� ����
		a = 10; b = 10; //�ʱⰪ ����
		
		//a++, ++a => a = a + 1
		System.out.println(a++);
		//������ ������, a ��� �� +1
		System.out.println(a);
		System.out.println(++a);
		//������ ������, +1 �� a ���
		
		//b--, -b => b = b - 1
		System.out.println(b--);
		//������ ������, b ��� �� -1
		System.out.println(b);
		System.out.println(--b);
		//������ ������, -1 �� b ���
		
		boolean boolean_a; //���� ����
		boolean_a = true; // �ʱⰪ ����
		
		System.out.println(boolean_a);
		System.out.println(!boolean_a);
		//!�����ڴ� �� ���� ������Ŵ
		
		//���׿�����
		int input_a, input_b;
		//���� ����
		input_a = input.nextInt();
		input_b = input.nextInt();
		//���� �ʱ�ȭ(������ �Է�)
		
		System.out.println(input_a + input_b);
		//����
		System.out.println(input_a - input_b);
		//����
		System.out.println(input_a / input_b);
		//������(���� ����)
		System.out.println((double)input_a / input_b);
		//���� => �Ǽ��� �� ��ȯ �� ������(���� ����)
		System.out.println(input_a % input_b);
		//������(�������� ����)
		System.out.println(input_a * input_b);
		//����
		
		input.close();
	}

}
