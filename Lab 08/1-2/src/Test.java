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
public class Test2 
{
	public static void main(String[] args)
	{
		
		try
		{
			throw new Exception();
		}
		catch(ExceptionC exception)
		{
			System.out.println(exception);
		}
		catch(ExceptionB exception)
		{
			System.out.println(exception);
		}
		catch(ExceptionA exception)
		{
			System.out.println(exception);
		}
		catch(Exception exception)
		{
			System.out.println(exception);
		}
		
		try
		{
			throw new ExceptionA();
		}
		catch(ExceptionC exception)
		{
			System.out.println(exception);
		}
		catch(ExceptionB exception)
		{
			System.out.println(exception);
		}
		catch(ExceptionA exception)
		{
			System.out.println(exception);
		}
		catch(Exception exception)
		{
			System.out.println(exception);
		}
		
		try
		{
			throw new ExceptionB();
		}
		catch(ExceptionC exception)
		{
			System.out.println(exception);
		}
		catch(ExceptionB exception)
		{
			System.out.println(exception);
		}
		catch(ExceptionA exception)
		{
			System.out.println(exception);
		}
		catch(Exception exception)
		{
			System.out.println(exception);
		}
		
		try
		{
			throw new ExceptionC();
		}
		catch(ExceptionC exception)
		{
			System.out.println(exception);
		}
		catch(ExceptionB exception)
		{
			System.out.println(exception);
		}
		catch(ExceptionA exception)
		{
			System.out.println(exception);
		}
		catch(Exception exception)
		{
			System.out.println(exception);
		}
		
	}
}