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
