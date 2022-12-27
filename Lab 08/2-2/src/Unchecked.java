//2020112099 송민지
//본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다.

import java.util.Scanner;

public class Unchecked {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("나눗셈할 두 개의 정수를 입력하시오");
		
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		
		System.out.printf("%d / %d = %d\n", n1,n2,n1/n2);
		
/*
 이 코드에서 일어날 수있는 예외는 
 수학적 연산에서 발생되는 예외 ArithmeticException와 
 정수를 읽는 코드가 실행되고 있을 때 사용자가 문자를 입력한 InputMismatchException이다.
이들은 unchecked exception 이므로 try catch 구문을 반드시 사용할 필요는 없다.
*/	
	}
}