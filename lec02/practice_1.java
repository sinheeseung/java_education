package lec02;
import java.util.Scanner;
//Scanner Ŭ���� ����
public class practice_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//input ��ü�� Scanner ��� �ο�
		
		int month,day;
		String week;
		//���� ����
		
		month = input.nextInt();
		day = input.nextInt();
		week = input.next();
		//Scanner�� ���� ���� �ʱ�ȭ
		
		System.out.printf("%d�� %d�� %s�Դϴ�.\n", month, day, week);
		
		System.out.println(month +"�� " + day + "�� "+week+"�Դϴ�.");
		//+�� �̿��� ���
		input.close();
	}

}
