package lec03;
import java.util.Scanner;
public class if_prac3 {
//0~100������ ������ �Է¹޾� ������ ���ϴ� ���α׷��� ��������
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���(0~100) : ");
		int score = input.nextInt();
		if(score >= 0 && score <= 100) {
			if(score >= 90)
				//100~90
				System.out.println("������ A�Դϴ�.");
			else if(score >= 80)
				//90~80
				System.out.println("������ B�Դϴ�.");
			else if(score >= 70)
				//80~70
				System.out.println("������ C�Դϴ�.");
			else
				//70~0
				System.out.println("������ F�Դϴ�.");
		}
		else
			System.out.println("�߸��� ������ �Է��Ͽ����ϴ�.");
		input.close();
	}

}
