import java.util.Scanner;

public class rectangle {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.printf("�� �� x�� �Է��Ͻÿ� : ");
		int x = sc.nextInt();

		System.out.printf("�� �� y�� �Է��Ͻÿ� : ");
		int y = sc.nextInt();
		
		if((x>=50) && (x<=100))
		{
			if ((y>=50) && (y<=100))
			{
				System.out.printf("�� �� (x, y)�� �� ���簢�� �ȿ� �����մϴ�.");
			}
			else
				System.out.printf("�� �� (x, y)�� �� ���簢�� �ȿ� �������� �ʽ��ϴ�.");
			
		}
		else
			System.out.printf("�� �� (x, y)�� �� ���簢�� �ȿ� �������� �ʽ��ϴ�.");
	}

}
