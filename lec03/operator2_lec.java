package lec03;

public class operator2_lec {

	public static void main(String[] args) {
		
		//�񱳿�����, ũ�� ���� ���Ͽ� ������ �����ϸ� true, �׷��� ������ false
		int a,b;
		a = 5; b = 10;
		System.out.println(a > b);
		//a�� b���� ũ��
		System.out.println(a >= b);
		//a�� b���� ũ�ų� ����
		System.out.println(a < b);
		//a�� b���� �۴�
		System.out.println(a <= b);
		//a�� b���� �۰ų� ����
		System.out.println(a == b);
		//a�� b�� ����
		System.out.println(a != b);
		//a�� b�� �����ʴ�.
		
		//��Ʈ ������
		int c,d;
		c = 20; d = 63;
		System.out.println(Integer.toBinaryString(c));
		//c�� �������� ���
		System.out.println(Integer.toBinaryString(d));
		//d�� �������� ���
		System.out.println(Integer.toBinaryString(d<<2));
		//d�� ��Ʈ�� �������� 2ĭ �̵�
		System.out.println(Integer.toBinaryString(d>>2));
		//d�� ��Ʈ�� ���������� 2ĭ �̵�
		System.out.println(Integer.toBinaryString(c&d));
		//c�� d�� ��Ʈ��
		System.out.println(Integer.toBinaryString(c|d));
		//c�� d�� ��Ʈ��
		System.out.println(Integer.toBinaryString(c^b));
		//c�� d�� ��Ÿ�� ����
		
		//���׿�����
		int e = 10;
		String result = e %2 == 0 ? "¦��" : "Ȧ��";
		//���ǽ��� ���ΰ�� ���� �׷��������� �������� ������
		System.out.println(result);
	}

}
