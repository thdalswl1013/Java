//2020112099 �۹���
//������ �� �ҽ������� �ٸ� ����� �ҽ��� �������� �ʰ� ���� �ۼ��Ͽ����ϴ�.

import java.util.Scanner;

public class Unchecked {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("�������� �� ���� ������ �Է��Ͻÿ�");
		
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		
		System.out.printf("%d / %d = %d\n", n1,n2,n1/n2);
		
/*
 �� �ڵ忡�� �Ͼ ���ִ� ���ܴ� 
 ������ ���꿡�� �߻��Ǵ� ���� ArithmeticException�� 
 ������ �д� �ڵ尡 ����ǰ� ���� �� ����ڰ� ���ڸ� �Է��� InputMismatchException�̴�.
�̵��� unchecked exception �̹Ƿ� try catch ������ �ݵ�� ����� �ʿ�� ����.
*/	
	}
}