//2020112099 �۹���
//������ �� �ҽ������� �ٸ� ����� �ҽ��� �������� �ʰ� ���� �ۼ��Ͽ����ϴ�

public class Test {
	
	private static int num1;
	private int num2;

	public static void show1() 
	{
		System.out.println(num1);//1(o) : num1�� static�ʵ�� ��밡���ϴ�.
		System.out.println(num2);//2(x) : static�޼ҵ忡 static�ʵ尡 �ƴ� num2�� ����� �� ����.
		show4();//3(o) : static �޼ҵ�� ���� Ŭ���� ���� static�޼ҵ�� ��� �����ϴ�.
		show5();//4(x) : static �޼ҵ�� ���� Ŭ���� ���� static�� ������ �޼ҵ�� ����� �� ����.
	}
	
	public void show2()
	{
		System.out.println(num1);//5(o) : non-static�޼ҵ�� ��� �ʵ带 ����� �� �ִ�.
		System.out.println(num2);//6(o) : non-static�޼ҵ�� ��� �ʵ带 ����� �� �ִ�.
		show4();//7(o) : non-static�޼ҵ�� ��� �޼Ҹ� ����� �� �ִ�.
		show5();//8(o) : non-static�޼ҵ�� ��� �޼Ҹ� ����� �� �ִ�.
	}
	
	public static void show4() {	
	}
	
	public void show5() {	
	}

}
	
