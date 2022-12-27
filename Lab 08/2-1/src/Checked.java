//2020112099 송민지
//본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다.

import java.util.Scanner;

class AgeException extends Exception
{
	public String toString(){
		return "음수를 입력하셨습니다.";
	}
}

public class Checked {
	public static void main(String[] args){
	
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 : ");
		
		try
		{
			int age = ageInput();
			System.out.printf("%d세입니다.",age);
		}
		
		catch(AgeException exception)
		{
			System.out.println(exception);
		}

	}
	
// AgeException은 RuntimeException을 상속받지 않기 때문에 checked Exception 이므로 반드시 예외처리를 해야한다.
	
	public static int ageInput() throws AgeException
	{
		Scanner sc2 = new Scanner(System.in);
		
		int age = sc2.nextInt();
		
		if(age<0 )
		{
			throw new AgeException();
		}
		return age;
	}
}
