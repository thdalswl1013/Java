//2020112099 �۹���
//������ �� �ҽ������� �ٸ� ����� �ҽ��� �������� �ʰ� ���� �ۼ��Ͽ����ϴ�.

import java.util.Scanner;

class AgeException extends Exception
{
	public String toString(){
		return "������ �Է��ϼ̽��ϴ�.";
	}
}

public class Checked {
	public static void main(String[] args){
	
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print("���̸� �Է��ϼ��� : ");
		
		try
		{
			int age = ageInput();
			System.out.printf("%d���Դϴ�.",age);
		}
		
		catch(AgeException exception)
		{
			System.out.println(exception);
		}

	}
	
// AgeException�� RuntimeException�� ��ӹ��� �ʱ� ������ checked Exception �̹Ƿ� �ݵ�� ����ó���� �ؾ��Ѵ�.
	
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
