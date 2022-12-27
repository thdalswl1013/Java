//2020112099 송민지
//본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다.

class ExceptionA extends Exception
{
	public String toString()
	{
		return "ExceptionA toString()";
	}
}

class ExceptionB extends ExceptionA
{
	public String toString()
	{
		return "ExceptionB toString()";
	}
}

class ExceptionC extends ExceptionB
{
	public String toString()
	{
		return "ExceptionC toString()";
	}
}
public class Test
{
	public static void main(String[] args)
	{
		try
		{
			throw new Exception();
		}
		catch(Exception exception)
		{
			System.out.println(exception);
		}
		
		try
		{
			throw new ExceptionA();
		}
		catch(Exception exception)
		{
			System.out.println(exception);
		}
		
		try
		{
			throw new ExceptionB();
		}
		catch(Exception exception)
		{
			System.out.println(exception);
		}
		
		try
		{
			throw new ExceptionC();
		}
		catch(Exception exception)
		{
			System.out.println(exception);
		}
	}
}
