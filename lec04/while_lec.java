package lec04;

public class while_lec {
	public static void main(String[] args) {
		//continue
		int i = 0, sum = 0;
		while(i < 10) {
			i++;
			if(i % 2 == 0)
				continue;
			System.out.println(i);
			sum = sum + i;
		}
		System.out.println(sum);
		//i % 2 == 0�� ���, �� i�� ¦���� ���
		//�ݺ����� �ִ� continue�Ʒ� ������ ������� �ʰ�
		//���� �ݺ����� �Ѿ ���� �� �� ����
		
		
		//break
		i = 0;
		while(true) {
			i++;
			if(i > 100) break;
			System.out.println(i);
		}
		//������ true�� ����loop�ӿ���
		//i�� 100���� Ŀ�� ��� break�� ���� �ݸ��� ����� ���� �� �� ����
		
		//while
		int a = 10;
		while(a < 10) {
			System.out.println("a�� 10���� �۽��ϴ�.");
			a++;
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
		
		//do while
	    a = 10;
		do{
			System.out.println("a�� 10���� �۽��ϴ�.");
			a++;
		}while(a < 10);
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
		
		//������ �������� �ʾƵ� do-while�� ��� �ּ� �ѹ���
		//�ݺ��� �����ϴ� ���� �� �� ����
	}
}
