//2020112099 송민지
//본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다

import java.util.Scanner;

public class math {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요: ");
		double input1 = scanner.nextDouble();
		System.out.println("abs("+input1+") is "+Math.abs(input1));
		
		System.out.println("숫자를 입력하세요: ");
		double input2 = scanner.nextDouble();
		System.out.println("ceil("+input2+") is "+Math.ceil(input2));
		
		System.out.println("숫자를 입력하세요: ");
		double input3 = scanner.nextDouble();
		System.out.println("cos("+input3+") is "+Math.cos(input3));
		
		System.out.println("숫자를 입력하세요: ");
		double input4 = scanner.nextDouble();
		System.out.println("exp("+input4+") is "+Math.exp(input4));
		
		System.out.println("숫자를 입력하세요: ");
		double input5 = scanner.nextDouble();
		System.out.println("floor("+input5+") is "+Math.floor(input5));
		
		
		System.out.println("숫자를 입력하세요: ");
		double input6 = scanner.nextDouble();
		System.out.println("log("+input6+") is "+Math.log(input6));
		
		System.out.println("숫자를 입력하세요: ");
		double input7 = scanner.nextDouble();
		double input8 = scanner.nextDouble();
		System.out.println("max("+input7+","+input8+") is "+Math.max(input7, input8));
		
		System.out.println("숫자를 입력하세요: ");
		double input9 = scanner.nextDouble();
		double input10 = scanner.nextDouble();
		System.out.println("min("+input9+","+input10+") is "+Math.min(input9, input10));
		
		System.out.println("숫자를 입력하세요: ");
		double input11 = scanner.nextDouble();
		double input12 = scanner.nextDouble();
		System.out.println("pow("+input11+","+input12+") is "+Math.pow(input11, input12));
		
		System.out.println("숫자를 입력하세요: ");
		double input13 = scanner.nextDouble();
		System.out.println("sin("+input13+") is "+Math.sin(input13));
		
		System.out.println("숫자를 입력하세요: ");
		double input14 = scanner.nextDouble();
		System.out.println("sqrt("+input14+") is "+Math.sqrt(input14));
	
		System.out.println("숫자를 입력하세요: ");
		double input15 = scanner.nextDouble();
		System.out.println("tan("+input15+") is "+Math.tan(input15));
	
	
	}

}
