//2020112099 �۹���
//������ �� �ҽ������� �ٸ� ����� �ҽ��� �������� �ʰ� ���� �ۼ��Ͽ����ϴ�.

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