package lec03;
import java.util.Scanner;
public class swtich_lec {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		switch(num) {
		case 0: //�̷� ���·� ��� �� ���� �ִ�.
		case 1:
			System.out.println("0 �Ǵ� 1�Դϴ�.");
			break;
		case 2:
			System.out.println("2�Դϴ�.");
			break;
		case 3:
			System.out.println("3�Դϴ�.");
			break;
		default:
			System.out.println("0~3�� �ƴմϴ�.");
			break;
		}
		input.close();

	}

}
