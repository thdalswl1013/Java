//2020112099 �۹���
//������ �� �ҽ������� �ٸ� ����� �ҽ��� �������� �ʰ� ���� �ۼ��Ͽ����ϴ�


import java.util.Scanner;
import java.util.Random;

public class education {

	public static void main(String[] args) {
		 Random random1 = new Random();
		 Random random2 = new Random();
		 int a= 1 + random1.nextInt(9);		 
		 int b= 1 +random2.nextInt(9);		 

		System.out.printf("How much is "+a+" times "+b+"?");
		System.out.println("Enter your answer(-1 to exit): ");
		Scanner scanner = new Scanner(System.in);
			
			
		while (true){
			double input = scanner.nextDouble();
			
			if (input==-1) {
				break;
			}
			
			else if (input==a*b) {
				System.out.println("Nice work!");
				break;
			}
			
			System.out.println("Enter your answer(-1 to exit): ");
			
		}
		
	}

}
