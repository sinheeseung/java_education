package lec03;
import java.util.Scanner;
public class swtich_lec {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		switch(num) {
		case 0: //이런 형태로 사용 할 수도 있다.
		case 1:
			System.out.println("0 또는 1입니다.");
			break;
		case 2:
			System.out.println("2입니다.");
			break;
		case 3:
			System.out.println("3입니다.");
			break;
		default:
			System.out.println("0~3이 아닙니다.");
			break;
		}
		input.close();

	}

}
