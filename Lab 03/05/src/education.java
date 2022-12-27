//2020112099 송민지
//본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다


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
