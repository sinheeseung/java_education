package lec03;
import java.util.Scanner;
public class if_prac1 {
/*������ �Է¹޾� 60�� �̻��̸� �հ�, 
	�׷��� ������ ���հ��� ����ϴ� ���α׷��� �����Ͽ���.*/
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		if(a >= 60) {
			System.out.println("�հ��Դϴ�.");
			System.out.println("�����մϴ�.");
		}
		else
			System.out.println("���հ��Դϴ�.");
			//������ ������ �ϳ��� ��� �߰�ȣ ������� �ʾƵ���
		input.close();

	}

}
