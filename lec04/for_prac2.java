package lec04;
import java.util.Scanner;
public class for_prac2 {
//���ڸ� �Է¹޾� �� ���ڰ� �Ҽ����� ���ϴ� ���α׷��� �ۼ��Ͽ���.
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int cnt=0;
		for(int i=1;i<=n;i++) {
			if(n % i == 0)
				cnt++;
		}
		if(cnt == 2)
			System.out.println(n +"�� �Ҽ��Դϴ�.");
		else
			System.out.println(n + "�� �Ҽ��� �ƴմϴ�.");
		input.close();

	}

}
