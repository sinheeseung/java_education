package lec06;

public class fun_lec {

	public static void main(String[] args) {
		/*�Լ��� ����ϸ� �ڵ带 �������� �ʰ� �Լ���
		  ȣ���ϸ鼭 �ڵ带 ����ȭ ��ų �� �ִ�*/
		
		fun_sum();
		//�޼ҵ��� ȣ��
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//
		fun_sum();
		//�޼ҵ��� ȣ��

	}
	//�޼ҵ��� ����
	static void fun_sum() {
		//public ������������, static : �ΰ�������
		//void �ڷ���, fun_sum : �޼ҵ� �̸�, () : �Ű�����
		//void �ڷ����� return���� ��ȯ���� ���� 
		
		//body
		int sum = 0;
		for(int i=1;i<=10;i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public static void main(String[] args) {
	/*�Լ��� ������� �ʴ´ٸ� �Ʒ��� �ڵ带 ����
	  �ϱ� ���ؼ��� ���� �ڵ带 �ݺ� ���Ѿ� �Ѵ�.
	
	int sum_1 = 0;
	for(int i=1;i<=10;i++) {
		sum_1 = sum_1 + i;
	}
	System.out.println(sum_1);
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//
	int sum_2 = 0;
	for(int i=1;i<=10;i++) {
		sum_2 = sum_2 + i;
	}
	System.out.println(sum_2);

}*/
}

