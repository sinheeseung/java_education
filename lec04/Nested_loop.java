package lec04;

public class Nested_loop {
	public static void main(String[] args) {
		/* ���� ������ i = 0 �� �� ���� �ݺ����� 10�� �����ϰ� �ȴ�.
		 * i = 1 �� �� ���� �ݺ����� �ٽ� 10�� �����ϰ� �ȴ�.
		 * i = 2 �� �� ���� �ݺ����� �ٽ� 10�� �����ϰ� �ȴ�.
		 ....�� 100�� ȸ���ϴ� �ݺ����� �ȴ�.*/
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				System.out.print(i + "" + j + " ");
			}
			System.out.println();
		}
	}
}
