package lec03;
import java.util.Scanner;
public class if_prac2 {
//������ �Է¹޾� �������, ��������, 0���� �˾Ƴ��� ���α׷��� �����Ͽ���.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		if(a > 0)
			System.out.println("a�� ����Դϴ�.");
		else if(a < 0)
			System.out.println("a�� �����Դϴ�.");
		else
			System.out.println("a�� 0�Դϴ�.");
		input.close();

	}

}
